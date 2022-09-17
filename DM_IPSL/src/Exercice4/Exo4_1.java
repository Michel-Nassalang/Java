package Exercice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo4_1 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Veuillez donner un nombre entier : ");
		try {
			int entree = scanner.nextInt();
			System.out.println("Le nombre entier saisi est : " + entree);
		} catch (InputMismatchException e) {
			System.out.println("Vous n'avez pas saisi un nombre entier");
		}
	}

}
