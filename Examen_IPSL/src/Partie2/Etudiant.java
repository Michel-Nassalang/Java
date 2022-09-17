package Partie2;

public class Etudiant extends Enseignant {

	public Etudiant(String prenom, String nom, int heures) {
		super(prenom, nom, heures);
	}

	public float salaire() {
		int hours = this.getHeures();
		float sal;
		if (hours >= 96) {
			sal = 96 * 3000;
		} else {
			sal = hours * 3000;
		}
		return sal;
	}

	public String type() {
		return "Etudiant";
	}

}
