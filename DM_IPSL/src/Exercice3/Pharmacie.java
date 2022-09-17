package Exercice3;

import java.util.Scanner;

class Pharmacie {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Client[] clients = new Client[2];
		Medicament[] medicaments = new Medicament[2];
		clients[0] = new Client("Malfichu", 0.0);
		clients[1] = new Client("Palichon", 0.0);
		medicaments[0] = new Medicament("Aspiron", 20.40, 5);
		medicaments[1] = new Medicament("Rhinoplexil", 19.15, 5);
		int choix;
		do {
			choix = menu();
			switch (choix) {
			case 1:
				achat(clients, medicaments);
				break;
			case 2:
				approvisionnement(medicaments);
				break;
			case 3:
				affichage(clients, medicaments);
				break;
			case 4:
				quitter();
			}
		} while (choix < 4);
	}

	static int menu() {
		int choix = 0;
		System.out.println("-------------------------------");
		System.out.println("1 : Achat de médicament");
		System.out.println("2 : Approvisionnement en médicaments");
		System.out.println("3 : Etats des stocks et des crédits");
		System.out.println("4 : Quitter");
		System.out.println("-------------------------------");
		while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
			System.out.print("Veuillez choisir un numéro: ");
			choix = scanner.nextInt();
		}
		return choix;
	}

	public static void quitter() {
		System.out.println("Sortie");
		System.out.println("J'espère que vous êtes satisfait de nos services");
	}

	public static void affichage(Client[] clients, Medicament[] medicaments) {
		System.out.println("Les clients de la pharmacie sont :");
		for (int i = 0; i < clients.length; i++) {
			System.out.println("- le client " + clients[i].getNom() + " avec " + clients[i].getCredit()
					+ " au niveau de la pharmacie");
		}
		System.out.println("                 -----------------");
		System.out.println("Les médicaments disponibles dans la pharmacie sont :");
		for (int i = 0; i < medicaments.length; i++) {
			System.out.println("- le medicament " + medicaments[i].getNom() + " avec " + medicaments[i].getStock()
					+ " d'exemplaires disponibles qui coûte " + medicaments[i].getPrix() + " euros l'euro.");
		}
	}

	public static void approvisionnement(Medicament[] medicaments) {
		Medicament medoc = lireMedicament(medicaments);
		System.out.print("Veuillez donner la quantité à ajouter au stock du médicament: ");
		int stock = scanner.nextInt();
		medoc.setStock(medoc.getStock() + stock);

	}

	public static void achat(Client[] clients, Medicament[] medicaments) {
		Client client = lireClient(clients);
		Medicament medoc = lireMedicament(medicaments);
		System.out.print("Veuillez donner la quantité du médicament souhaité: ");
		int nb = scanner.nextInt();
		if (nb > medoc.getStock()) {
			System.out.println("On a en stock une quantité moins que celui que vous avez souhaité");
			nb = medoc.getStock();
		}
		System.out.print("Veuillez donner le payement: ");
		double pay = scanner.nextDouble();
		double prix = nb * medoc.getPrix();
		client.setCredit(client.getCredit() + (pay - prix));
		medoc.setStock(medoc.getStock() - nb);
		System.out.println(client.getNom() + " vous avez maintenant un credit de " + client.getCredit());
	}

	public static Medicament lireMedicament(Medicament[] medicaments) {
		Medicament medoc = null;
		while (medoc == null) {
			scanner.reset();
			System.out.print("Veuillez donner le bon nom du médicament recherché: ");
			String namedoc = scanner.next();
			for (int i = 0; i < medicaments.length; i++) {
				if (medicaments[i].getNom().equals(namedoc)) {
					medoc = medicaments[i];
				}
			}
		}
		;
		return medoc;
	}

	public static Client lireClient(Client[] clients) {
		Client client = null;
		while (client == null) {
			scanner.reset();
			System.out.print("Veuillez donner le bon nom du client recherché: ");
			String name = scanner.next();
			for (int i = 0; i < clients.length; i++) {
				if (clients[i].getNom().equals(name)) {
					client = clients[i];
				}
			}
		}
		;
		return client;
	}
}