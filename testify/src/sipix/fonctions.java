package sipix;

public class fonctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salut();
		calcul(2,3);
	}
	public static void salut() {
		System.out.println("Salut l\'ami !!");
	}
	protected static int calcul(int a, int b) {
		int c = a + b;
		System.out.print("Le resultat est : "  + c);
		return c;
	}
}
