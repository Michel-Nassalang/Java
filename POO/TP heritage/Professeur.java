public class Professeur extends Person {
	private String sujet;
public void explicaton(String sujet) {
	System.out.println("explication du cours de :" +sujet);
}
 public Professeur() {
	super();
	// TODO Auto-generated constructor stub
}
public Professeur(String prenom, String nom, int age) {
	super(prenom, nom, age);
	// TODO Auto-generated constructor stub
}

 public void afficheAge() {
 	System.out.println("Le profeseur : "+getPrenom()+" "+getNom()+" "+getAge());
}
}
