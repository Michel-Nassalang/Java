public class Person {
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	private String prenom;
	private String nom;
	private int age;
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

	public void salutation() {
		System.out.println("Bonjour");
	}
	
}
