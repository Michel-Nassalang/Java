package Entite;

public class Personne {
	private int idPersonne;
	private String prenom;
	private String nom;
	private int age;
	private String genre;
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Personne(int idPersonne, String prenom, String nom, int age, String genre) {
		super();
		this.idPersonne = idPersonne;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.genre = genre;
	}

}
