public class Etudiant extends Person {
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String prenom, String nom, int age) {
		super(prenom, nom, age);
		// TODO Auto-generated constructor stub
	}
	public void allerClasse() {
	System.out.println("je vais en classe");	
	}
	public void afficherAge() {
    	System.out.println("l'etudiant : "+getPrenom()+" "+getNom()+" "+getAge());
    }
}
