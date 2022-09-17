package Partie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

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

    	System.out.print("Veuillez donner un nombre entier : ");
		// Fibonacci du nombre a
		int nb = saisie();
		int sum = 0;
		for(int i=0; i<=nb; i++) {
			sum = sum + i;
		}
		System.out.println("La série de Fibonacci jusqu'à " + nb + " termes est égale à : " + sum);
	}


}
