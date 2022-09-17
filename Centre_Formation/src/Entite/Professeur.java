package Entite;

public class Professeur {
	private int idProfesseur;
	private String prenom;
	private String nom;
	private String grade;
	private int age;
	private String genre;
	public int getIdProfesseur() {
		return idProfesseur;
	}
	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
	public Professeur(int idProfesseur, String prenom, String nom, String grade, int age, String genre) {
		super();
		this.idProfesseur = idProfesseur;
		this.prenom = prenom;
		this.nom = nom;
		this.grade = grade;
		this.age = age;
		this.genre = genre;
	}

}
