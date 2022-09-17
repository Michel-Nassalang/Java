package exercice2;

public abstract class Enseignant {
	private String prenom;
	private String nom;
	private int heures;
	private float charge = (float) 0.75;

	public Enseignant(String prenom, String nom, int heures) {
		// TODO Auto-generated constructor stub
		this.setPrenom(prenom);
		this.setNom(nom);
		this.setHeures(heures);
	}

	public abstract float salaire();

	public float charges() {
		return getCharge() * salaire();
	};

	public abstract String type();

	public void cout() {
		float cout = salaire() + charges();
		System.out.println("L'enseignant " + type() + " du nom de " + getPrenom() + " " + getNom() + " coûte " + cout
				+ " euros à l'université");
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public float getCharge() {
		return charge;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

}
