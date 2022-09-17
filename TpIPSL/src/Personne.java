
public class Personne {
	
	private String nom;
	private Maison home;

	public Personne(String nom) {
		this.nom = nom;
	}
	
	public Personne(String nom, Maison house) {
		this.nom = nom;
		this.home = house;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setnom(String name) {
		this.nom = name;
	}
	
	public Maison getHome() {
		return this.home;
	}
	public void setHome(Maison house) {
		this.home = house;
	}
	
	public void info() {
		if(this.getHome() == null) {
			System.out.println(getNom() + " n'a pas de maison.");
		}else {
			System.out.println(getNom() +" est le propriétaire de la maison qui est d'une surface de " + this.home.getSurface() + " et qui a une porte de couleur "+ this.home.getPorte().getCouleur() + ".");
		}
	}

}
