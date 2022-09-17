package Partie2;

public class Chercheur extends Enseignant {
	public Chercheur(String prenom, String nom, int heures) {
		super(prenom, nom, heures);
	}

	public float salaire() {
		int hours = this.getHeures();
		int comp;
		if (hours > 192) {
			comp = hours - 192;
		} else {
			comp = 0;
		}
		float sal = (200000 * 12) + (comp * 4000);
		return sal;
	}

	public String type() {
		return "Chercheur";
	}
}
