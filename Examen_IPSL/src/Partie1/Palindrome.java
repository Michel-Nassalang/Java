package Partie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
	public static int saisie() {
		boolean error;
		int entree=0;
		do {
			try {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				entree = scanner.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Veuillez réessayer en donnant un nombre entier : ");
				error = true;
			}
		} while (error == true);
		return entree;
	}
    public static void main(String[] args) {
    	System.out.print("Veuillez donner un numéro : ");
    	int entree = saisie();
       int reste, initial, inverse = 0;

        initial = entree;

        
        while( entree != 0 )
        {
            reste = entree % 10;
            inverse = inverse * 10 + reste;
            entree  /= 10;
        }

        if (initial == inverse)
            System.out.println(initial +" est un palindrome.");
        else
            System.out.println(initial +" n'est pas un palindrome.");
    }
}