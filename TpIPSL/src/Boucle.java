
public class Boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factorielle du nombre a
		java.util.Scanner entree = new java.util.Scanner(System.in);
		int a = 8;
		int b = 1;
		int c=1;
		int d = a;
		while(a>1) {
			b = (a-1)*a;
			c = b*c;
			a= a-2;
		}
		System.out.println("La factorielle de " + d + " est égale à " + c);
		String nom = entree.next();
		System.out.println(nom);
	}

}
