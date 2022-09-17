package exercice2;

public class InstanceEnseignant {

	public static void main(String[] args) {
		Chercheur chercheur1 = new Chercheur("Dame", "Diongue", 200);
		Chercheur chercheur2 = new Chercheur("Papa samour", "Diop", 250);
		Vacataire vacataire1 = new Vacataire("Ibrahima", "Gueye", 115, "EPT");
		Vacataire vacataire2 = new Vacataire("youssou", "Faye", 87, "EPT");
		Etudiant etudiant1 = new Etudiant("Papa El Hadji", "Diop", 57);
		Etudiant etudiant2 = new Etudiant("Abdou Samath", "Seck", 76);
		chercheur1.cout();
		chercheur2.cout();
		vacataire1.cout();
		vacataire2.cout();
		etudiant1.cout();
		etudiant2.cout();
	}

}
