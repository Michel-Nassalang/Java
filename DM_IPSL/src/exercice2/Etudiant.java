package exercice2;

public class Etudiant extends Enseignant {

	public Etudiant(String prenom, String nom, int heures) {
		// TODO Auto-generated constructor stub
		super(prenom, nom, heures);
	}

	public float salaire() {
		int hours = super.getHeures();
		float sal;
		if (hours >= 96) {
			sal = 96 * 30;
		} else {
			sal = hours * 30;
		}
		return sal;
	}

	public String type() {
		return "Etudiant";
	}

}
