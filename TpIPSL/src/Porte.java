
public class Porte {

	private String couleur;
	
	public Porte(String couleur) {
		super();
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(String m) {
		this.couleur = m;
	}

	public void afficherPorte() {
		System.out.println(this + " est une porte de couleur " + getCouleur());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
