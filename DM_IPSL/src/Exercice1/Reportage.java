package Exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reportage extends Emission {
	private String theme;
	public static String[] themes = { "information", "animalier", "culturel" }; // thèmes de reportage prédéfini

	public Reportage(String nom, int duree, int theme) {
		super(nom, duree);
		this.theme = themes[theme - 1];
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String type() { // fonction pour connaitre le type d'émission
		return "reportage";
	}

	public void programme(int h) { // fonction pour programmer un reportage
		if ((h >= 14 && h <= 18) || (h >= 0 && h <= 6)) {
			this.setHdiffuse(h);
			System.out.println("Le " + this.type() + " est programmé à " + h + " heures");
		} else {
			boolean error = true;
			int value = 0;
			do {
				System.out.print("Donnez une heure comprise entre 0-6 heures ou entre 14-18 heures: ");
				try {
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					value = scan.nextInt();
					this.setHdiffuse(value);
					error = false;
					System.out.println("Le " + this.type() + " est programmé à " + value + " heures");
				} catch (InputMismatchException e) {
					System.out.print(
							"Veuillez donner une valeur correcte et comprise entre 0-6 heures ou 18-23 heures: ");
					error = true;
				}
			} while (error == true || ((value < 14 && value > 6) || (value < 23 && value > 18) || value == 0));
		}
	}

	public void affichage() { // fonction d'affichage
		System.out.println("-------------------------");
		System.out.println(
				"On a pour cette émission : le " + type() + " \"" + this.getNom() + "\" qui dure " + this.getDuree()
						+ " h, commence à " + this.getHdiffuse() + " h et traite le thème " + this.getTheme() + ".");
	}
}
