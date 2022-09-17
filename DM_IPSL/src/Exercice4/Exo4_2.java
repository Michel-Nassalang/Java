package Exercice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo4_2 {

	public static void main(String[] args) {
		boolean error;
		System.out.print("Veuillez donner un nombre entier : ");
		int entree;
		do {
			try {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				entree = scanner.nextInt();
				System.out.println("Le nombre entier saisi est : " + entree);
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Veuillez réessayer en donnant un nombre entier : ");
				error = true;
			}
		} while (error == true);

	}
}
