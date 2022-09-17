package Exercice5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Gestion_stock {

	static Collection<Article> stock = new ArrayList<Article>();

	public static void presence(Collection<Article> stock) {
		if (stock.isEmpty()) {
			System.out.println("Le stock est vide.");
		} else {
			System.out.println("Le stock n'est pas vide.");
		}
	}

	public static void affichage(Collection<Article> collection) { // methode d'affichage
		if (collection.isEmpty()) {
			System.out.println("Rien n'a été trouvé.");
		} else {
			System.out.println("Les articles présents dans le stock sont : ");
		}
		Iterator<Article> it = collection.iterator();
		while (it.hasNext()) {
			Article article = (Article) it.next();
			System.out.println(article.getNom() + " qui est référencé par " + article.getReference()
					+ " avec une quantité de " + article.getQuantite() + " coûte " + article.getPrix() + " Fcfa");
		}
	}

	public static Article rechercheRef(int reference) { // methode recherche par reference
		Article produit = null;
		Iterator<Article> it = stock.iterator();
		while (it.hasNext()) {
			Article article = (Article) it.next();
			if (article.getReference() == reference) {
				produit = article;
				break;
			}
		}
		return produit;
	}

	public static Article rechercheNom(String nom) { // methode recherche par nom
		Article produit = null;
		Iterator<Article> it = stock.iterator();
		while (it.hasNext()) {
			Article article = (Article) it.next();
			if (article.getNom() == nom) {
				produit = article;
				break;
			}
		}
		return produit;
	}

	public static Collection<Article> recherchePrix(float prixmin, float prixmax) { // methode recherche par prix
		Collection<Article> caisse = new ArrayList<Article>();
		Iterator<Article> it = stock.iterator();
		while (it.hasNext()) {
			Article article = (Article) it.next();
			if (article.getPrix() >= prixmin && article.getPrix() <= prixmax) {
				caisse.add(article);
			}
		}
		return caisse;
	}

	public static void ajout(int reference, String nom, float prix, int quantite) { // methode ajouter
		if (rechercheRef(reference) == null) {
			Article newart = new Article(reference, nom, prix, quantite);
			stock.add(newart);
			System.out.println("L'élement donné est nouvellement ajouté dans le stock.");
		} else {
			modification(reference, prix, rechercheRef(reference).getQuantite() + quantite);
			System.out.println("L'élement réferencé existe déja, on a donc augmenté la quantité stockée");
		}
	}

	public static void modification(int reference, float prix, int quantite) { // methode modifier
		if (rechercheRef(reference) != null) {
			rechercheRef(reference).setPrix(prix);
			rechercheRef(reference).setQuantite(quantite);
		}
	}

	public static void suppression(int reference) { // methode supprimer
		if (rechercheRef(reference) != null) {
			stock.remove(rechercheRef(reference));
			System.out.println("La suppression de l'élement réferencé est faite.");
		} else {
			System.out.println("L'élement réferencé n'existe pas dans le stock");
		}
	}

	public static void quitter() { // methode quitter
		System.out.println("Nous espérons que vous êtes satisfait.");
	}

	// -------------------------
	static int menu() {
		int entree = 0;
		System.out.println("--------------------------");
		System.out.println("1 : Rechercher un article par référence");
		System.out.println("2 : Ajouter un article au stock en vérifiant l’unicité de la référence");
		System.out.println("3 : Supprimer un article par référence");
		System.out.println("4 : Modifier un article par référence");
		System.out.println("5 : Rechercher un article par nom");
		System.out.println("6 : Rechercher un article par intervalle de prix de vente");
		System.out.println("7 : Afficher tous les articles");
		System.out.println("8 :  Quitter");
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.print("Veuillez choisir parmi les services proposés dans le menu suivant : ");
		while ((entree != 1) && (entree != 2) && (entree != 3) && (entree != 4) && (entree != 5) && (entree != 6)
				&& (entree != 7) && (entree != 8)) {
			entree = scanner.nextInt();
		}
		return entree;
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stock.add(new Article(1, "Tomates", 25, 550));
		stock.add(new Article(2, "Patates", 50, 340));
		stock.add(new Article(3, "Carottes", 75, 150));
		stock.add(new Article(4, "Oignons", 25, 256));
		stock.add(new Article(5, "Poissons", 125, 125));
		int entree;
		System.out.println("Bonjour dans notre service de gestion de stock !!!");
		do {
			entree = menu();
			switch (entree) {
			case 1:
				System.out.println("Recherche d'un article par référence");
				System.out.println("Donnez la référence de l'article à rechercher");
				Integer ref = scanner.nextInt();
				Article produit = rechercheRef(ref);
				System.out.println(produit.getNom() + " qui est référencé par " + produit.getReference()
						+ " avec une quantité de " + produit.getQuantite() + " coûte " + produit.getPrix() + " Fcfa");
				break;
			case 2:
				System.out.println("Ajout d'un article au stock");
				System.out.println("Donnez succesivement la référence, le nom, le prix et la quantité");
				Integer newref = scanner.nextInt();
				String nom = scanner.next();
				Integer prix = scanner.nextInt();
				Integer quantite = scanner.nextInt();
				ajout(newref, nom, prix, quantite);
				break;
			case 3:
				System.out.println("Supprission d'un article par référence");
				System.out.println("Donnez la référence de l'article à supprimer");
				Integer supref = scanner.nextInt();
				suppression(supref);
				break;
			case 4:
				System.out.println("Modification d'un article par référence");
				System.out.println("Donnez succesivement la référence, le prix et la quantité");
				Integer modref = scanner.nextInt();
				Integer modprix = scanner.nextInt();
				Integer modquantite = scanner.nextInt();
				modification(modref, modprix, modquantite);
				break;
			case 5:
				System.out.println("Recherche d'un article par nom");
				System.out.println("Donnez le nom de l'article à rechercher");
				String searchnom = scanner.next();
				Article produitNom = rechercheNom(searchnom);
				System.out.println(produitNom.getNom() + " qui est référencé par " + produitNom.getReference()
						+ " avec une quantité de " + produitNom.getQuantite() + " coûte " + produitNom.getPrix()
						+ " Fcfa");
				break;
			case 6:
				System.out.println("Recherche d'un article par intervalle de prix de vente");
				System.out.println(
						"Donnez l'intervalle de prix où on recherche en donnant le minimum suivi du maximum: ");
				float prixmin = scanner.nextFloat();
				float prixmax = scanner.nextFloat();
				Collection<Article> intervalle = recherchePrix(prixmin, prixmax);
				affichage(intervalle);
				break;
			case 7:
				System.out.println("Affichage de tous les articles");
				affichage(stock);
				break;
			case 8:
				System.out.println("sortie");
				quitter();
				break;
			}
		} while (entree < 8);

	}

}
