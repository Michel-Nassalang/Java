package Partie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PGDC {
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
		System.out.print("Veuillez donner le premier nombre : ");
		int nb1 = saisie();
		System.out.print("Veuillez donner le deuxieme nombre : ");
		int nb2 = saisie();
		int inf;
		if(nb1<nb2) {
			inf = nb1;
		}else {
			inf = nb2;
		}
		int nb;
		if(inf<0) {
			nb = (int) (inf * -1);
		}else {
			nb = (int) (inf);
		}
		double pg = 1;
		for(int i = 1; i<=nb; i++) {
			if(nb1%i == 0 && nb2%i == 0) {
				pg = i;
			}
		}
		System.out.println("Le plus grand diviseur commun des nombres " + nb1 + " et " + nb2 + " est égale à : " + pg);
	}

}
