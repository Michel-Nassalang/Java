package exercice2;

public class Chercheur extends Enseignant {
	public Chercheur(String prenom, String nom, int heures) {
		// TODO Auto-generated constructor stub
		super(prenom, nom, heures);
	}

	public float salaire() {
		int hours = super.getHeures();
		int comp;
		if (hours > 192) {
			comp = hours - 192;
		} else {
			comp = 0;
		}
		float sal = 2000 * 12 + comp * 40;
		return sal;
	}

	public String type() {
		return "Chercheur";
	}
}
