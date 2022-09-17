
public class Employe {

	private String nom;
	private String matricule;
	private float indice;
	
	public Employe() {}
	
	public Employe(String nom, String matricule, float indice) {
		this.nom = nom;
		this.matricule = matricule;
		this.indice = indice;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public float getIndice() {
		return indice;
	}

	public void setIndice(float indice) {
		this.indice = indice;
	}
	
	public float salaire(int s) {
		return getIndice()*s;
	}
	
	public void afficher() {
		System.out.println("L'employé " + getNom() + " détient la matricule " + getMatricule() + " et a une salaire de " + salaire(250000) );
	}

}
