package Partie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parfait {
	public static int saisie() { // fonction de saisie d'un nombre 
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
		System.out.print("Veuillez donner un nombre : ");
		boolean verif = true;
		int entree = saisie();
		int nb;
		if(entree<0) {
			nb = (int) (entree * -1);
		}else {
			nb = (int) (entree);
		}
		for(int i=2; i<nb; i++) {
			if(entree % i == 0) {
				verif = false;
			}
		}
		if(verif == true) {
			System.out.println("Le nombre "+ entree +" est parfait.");
		}else {
			System.out.println("Le nombre "+ entree +" n'est pas parfait.");
		}

	}

}
