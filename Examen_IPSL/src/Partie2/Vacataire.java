package Partie2;

public class Vacataire extends Enseignant {
	private String organisme;

	public Vacataire(String prenom, String nom, int heures, String organisme) {
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
		int hours = this.getHeures();

		return hours * 4000;
	}

	public String type() {
		return "Vacataire";
	}

}
