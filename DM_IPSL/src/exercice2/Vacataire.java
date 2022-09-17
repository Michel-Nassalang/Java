package exercice2;

public class Vacataire extends Enseignant {
	private String organisme;

	public Vacataire(String prenom, String nom, int heures, String organisme) {
		// TODO Auto-generated constructor stub
		super(prenom, nom, heures);
		this.organisme = organisme;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public float salaire() {
		int hours = super.getHeures();

		return hours * 40;
	}

	public String type() {
		return "Vacataire";
	}

}
