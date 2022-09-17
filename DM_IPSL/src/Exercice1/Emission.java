package Exercice1;

import java.util.Scanner;

public abstract class Emission {

	private String nom;
	private int duree;
	private int hdiffuse;

	public Emission(String nom, int duree) {
		this.setNom(nom);
		this.setDuree(duree);
	}

	public int heurefin() { // heure de fin du programme
		if (this.getHdiffuse() + duree == 24) {
			return 0;
		} else {
			return this.getHdiffuse() + duree;
		}
	}

	public String heureFin() {
		return "L'heure de fin de l'émission est " + heurefin();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getHdiffuse() {
		return hdiffuse;
	}

	public void setHdiffuse(int hdiffuse) { // setter de l'heure de diffusion
		while (hdiffuse < 0 || hdiffuse > 23) {
			System.out.println("Donnez une valeur comprise entre 0 et 24 heures");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			hdiffuse = scan.nextInt();
		}
		this.hdiffuse = hdiffuse;
	}

	public abstract String type(); // fonction pour connaitre le type d'émission

	public abstract void programme(int h); // fonction pour programmer une émission

	public abstract void affichage(); // fonction d'affichage de l'émission

}
