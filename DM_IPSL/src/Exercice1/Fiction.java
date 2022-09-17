package Exercice1;

import java.util.Scanner;

public class Fiction extends Emission {

	private String realis;
	private int annee;
	private boolean redif;

	public Fiction(String nom, int annee, String realis, int duree, boolean redif) {
		super(nom, duree);
		this.realis = realis;
		this.redif = redif;
		this.annee = annee;
	}

	public boolean isRedif() {
		return redif;
	}

	public void setRedif(boolean redif) {
		this.redif = redif;
	}

	public String getRealis() {
		return realis;
	}

	public void setRealis(String realis) {
		this.realis = realis;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String type() { // fonction pour connaitre le type d'émission
		return "fiction";
	}

	public String rediffusion() {
		if (this.isRedif() == true) {
			return "rédiffusée";
		} else {
			return "nouvellement diffusée";
		}
	}

	public void programme(int h) { // fonction pour programmer une fiction
		if (this.isRedif() == true || h == 21) {
			this.setHdiffuse(h);
			System.out.println("La " + this.type() + " est programmée à " + h + " heures: ");
		} else {
			System.out.println("Le " + this.type() + " ne peut être programmé qu'à 21 heures");
			System.out.println("Tapez vrai si vous voulez le programmer à 21 heures sinon taper faux: ");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String accept = scan.next();
			if (accept.equals("vrai")) {
				this.setHdiffuse(21);
			} else {
				System.out.println("La programmation est annulée.");
			}
		}
	}

	public void affichage() { // fonction d'affichage
		System.out.println("-------------------------");
		System.out.println("On a pour cette émission : la " + type() + " \"" + this.getNom() + "\" "
				+ this.rediffusion() + " qui dure " + this.getDuree() + " h, commence à " + this.getHdiffuse()
				+ " h et est réalisé par " + this.getRealis() + " à l'an " + this.getAnnee() + ".");
	}

}
