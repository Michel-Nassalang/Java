
public class InstancesHeurePersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		Montre M1 = new Montre(23,15);
		Montre M2 = new Montre(M1);
		Montre M3 = new Montre(11,50);
		
		M1.affichage();
		M2.affichage();
		M3.affichage();
		
		int a = entree.nextInt();
		int b = entree.nextInt();
		int c = entree.nextInt();
		
		M2.ajouterMinute(a);
		M1.ajouterMinute(b);
		M3.ajouterMinute(c);
		
		PersonneM P1 = new PersonneM("Abdoulaye Wade");
		PersonneM P2 = new PersonneM("Macky Sall", M2);
		
		P2.demanderHeure(P1);
		P2.setMontre(M1);
		P1.setMontre(M1);
		P2.demanderHeure(P1);
		
	}

}
