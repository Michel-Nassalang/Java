package Brain;

public class Maxde3nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		System.out.println("Donner les 3 nombres");
		int a = entree.nextInt();
		int b = entree.nextInt();
		int c = entree.nextInt();
		int d= a;
		if (b>d) {
			d=b;
		}
		if (c>d) {
			d=c;
		}
		System.out.println("Le maximum est : " + d);
	}

}
