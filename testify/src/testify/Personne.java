package testify;
public class Personne {
	private String nom; // on met la variable en private si on veut utiliser les getters et les setters
	private String prenom;
	private int age;
	private String sexe;

	public Personne(String nom, String prenom, int age, String sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public int getAge() {
		return this.age;
	}
	public String getSexe() {
		return this.sexe;
	}
	
	public void informations() {
		System.out.println("La personne désignée porte le nom de " + getPrenom() + " "+ this.nom + " " + " et est agé de " + this.age + " ans et est de sexe " + this.sexe + ".");
	}
	
	
}
