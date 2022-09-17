
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Person Personne1=new Person();
	Etudiant etudiant1=new Etudiant("Fatou","Mbengue",22);
	Professeur prof1=new Professeur("Imam","Shu",21);
	etudiant1.afficherAge();
	etudiant1.salutation();
	etudiant1.allerClasse();
	prof1.salutation();
	prof1.explicaton("POO");
	prof1.afficheAge();
	

	}

}
