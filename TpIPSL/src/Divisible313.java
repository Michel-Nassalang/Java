
public class Divisible313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		System.out.println("Donner un nombre pour voir si c'est divisible par 3 :");
		int a = entree.nextInt();
		if(a%3==0 && a%13==0) {
			System.out.println("Le nombre " + a +" est divisible par 3 et 13.");
		}else {
			System.out.println("Le nombre " + a +" n'est divisible par 3 et 13.");
		}
	}

}
