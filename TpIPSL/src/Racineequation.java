import java.lang.Math;
public class Racineequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		System.out.println("Donner succesivement les valeurs a et b et c :");
		float a = entree.nextFloat();
		float b = entree.nextFloat();
		float c = entree.nextFloat();
		
		float det = (float) (Math.pow(b,2) - 4*a*c);
		if(det >= 0) {
			float x1 = (float) (-b + Math.pow(det, 0.5)/2*a);
			float x2 = (float) (-b - Math.pow(det, 0.5)/2*a);
			
			System.out.println("Les racines de l'équation sont : " + x1 + ", " + x2);
		}
		else {
			System.out.println("L'équation n'admet pas de solution.");
		}
		
	}

}
