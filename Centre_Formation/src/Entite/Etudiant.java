package Entite;

public class Etudiant {
	
	private int codeEtudiant;
	private String prenom;
	private String nom;
	private String libelleClasse;
	private int age;
	private String genre;
	public Etudiant(int codeEtudiant, String prenom, String nom, String libelleClasse, int age, String genre) {
		super();
		this.codeEtudiant = codeEtudiant;
		this.prenom = prenom;
		this.nom = nom;
		this.libelleClasse = libelleClasse;
		this.age = age;
		this.genre = genre;
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
	public String getLibelleClasse() {
		return libelleClasse;
	}
	public void setLibelleClasse(String libelleClasse) {
		this.libelleClasse = libelleClasse;
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
	public int getCodeEtudiant() {
		return codeEtudiant;
	}
	public void setCodeEtudiant(int codeEtudiant) {
		this.codeEtudiant = codeEtudiant;
	}
	

}
