package Exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divertissement extends Emission {

	private String animateur;

	public Divertissement(String nom, String animateur) {
		super(nom, 2);
		this.setAnimateur(animateur);
	}

	public String getAnimateur() {
		return animateur;
	}

	public void setAnimateur(String animateur) {
		this.animateur = animateur;
	}

	public String type() { // fonction pour connaitre le type d'émission
		return "divertissement";
	}

	public void programme(int h) { // fonction pour programmer un divertissement
		if (h >= 18 && h <= 23) {
			this.setHdiffuse(h);
			System.out.println("Le " + this.type() + " est programmé à " + h + " heures");
		} else {
			boolean error = true;
			int value = 0;
			do {
				System.out.print("Donnez une heure comprise entre 18-23 heures: ");
				try {
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					value = scan.nextInt();
					this.setHdiffuse(value);
					error = false;
					System.out.println("Le " + this.type() + " est programmé à " + value + " heures");
				} catch (InputMismatchException e) {
					System.out.print("Veuillez donner une valeur correcte et comprise entre 18-23 heures: ");
					error = true;
				}
			} while (error == true || (value < 18 || value > 23));
		}
	}

	public void affichage() { // fonction d'affichage
		System.out.println("-------------------------");
		System.out.println(
				"On a pour cette émission : le " + type() + " \"" + this.getNom() + "\" qui dure " + this.getDuree()
						+ " h, commence à " + this.getHdiffuse() + " h et est animé par " + this.getAnimateur() + ".");
	}

}
