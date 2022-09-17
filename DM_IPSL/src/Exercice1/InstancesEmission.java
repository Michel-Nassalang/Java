package Exercice1;

import java.util.ArrayList;

public class InstancesEmission {

	public static void main(String[] args) {

		Emission[] proTele = new Emission[24];

		Reportage r1 = new Reportage("L'émigration au Sénégal", 2, 1);
		Reportage r2 = new Reportage("La grève des enseignants", 3, 3);
		Fiction f1 = new Fiction("Mortal Combat", 2002, "Fernando Gomez", 2, false);
		Fiction f2 = new Fiction("Outsiders", 2021, "Gabriella Assine", 2, true);
		Divertissement d1 = new Divertissement("Clip Dance-Hall", "DJ Peuk");
		Divertissement d2 = new Divertissement("Lamb-J", "Malal Junior");
		Reportage r3 = new Reportage("Sénégal High-tech", 2, 1);
		Reportage r4 = new Reportage("People of Dakar", 1, 3);
		Fiction f3 = new Fiction("Superman", 2018, "Peter Chamly", 2, true);
		Fiction f4 = new Fiction("Black Panther", 2019, "Alexandre Féroman", 3, true);
		// Divertissement d3 = new Divertissement("Tendances 2022", "Aida Kébé");
		// Divertissement d4 = new Divertissement("Sourire à mourir", "Damien Mendy");
		r1.programme(17);
		r2.programme(5);
		r3.programme(14);
		r4.programme(15);
		f1.programme(21);
		f2.programme(19);
		f3.programme(9);
		f4.programme(0);
		d1.programme(18);
		d2.programme(22);

		proTele[0] = r1;
		proTele[1] = d1;
		proTele[2] = f1;
		proTele[3] = d2;
		proTele[4] = f2;
		proTele[5] = r2;
		proTele[6] = r3;
		proTele[7] = f3;
		proTele[8] = f4;
		proTele[9] = r4;

		int len = 9; // Nombre d'émissions programmées

		for (int i = 0; i < len; i++) { // liste des émissions programmées dans la journée
			proTele[i].affichage();
		}

		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("Superposition des programmes : ");

		int sp = 0;
		for (int i = 0; i < len; i++) { // superposition des programmes
			for (int j = 0; j < len; j++) {
				if (i != j && proTele[i].heurefin() > proTele[j].getHdiffuse()
						&& proTele[i].getHdiffuse() < proTele[j].getHdiffuse()) {
					System.out.println("Les emissions \"" + proTele[i].getNom() + "\" de type " + proTele[i].type()
							+ " et \"" + proTele[j].getNom() + "\" de type " + proTele[j].type()
							+ " programmées sont superposées");
					System.out.println("\"" + proTele[i].getNom() + "\"   Début: " + proTele[i].getHdiffuse()
							+ "h    Fin: " + proTele[i].heurefin() + "h");
					System.out.println("\"" + proTele[j].getNom() + "\"   Début: " + proTele[j].getHdiffuse()
							+ "h    Fin: " + proTele[j].heurefin() + "h");
					sp = sp + 2;
				}
			}
		}
		System.out.println("Nous avons au total " + sp + " émissions superposées.");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("Programme d'émissions du jour : ");
		ArrayList<Integer> hours = new ArrayList<Integer>();
		for (int i = 0; i <= 23; i++) { // vérification des créneaux
			for (int j = 0; j < len; j++) {
				if (proTele[j].getHdiffuse() == i) {
					for (int k = 0; k < (proTele[j].getDuree()); k++) {
						int l = i + k;
						hours.add(l);
						System.out.println("A " + l + "h on a l'émission " + proTele[j].type() + " \""
								+ proTele[j].getNom() + "\"; ");
					}
				}
			}
			if (!hours.contains(i)) {
				System.out.println("A " + i + " on n'a pas d'émission.");
			}
		}

	}

}
