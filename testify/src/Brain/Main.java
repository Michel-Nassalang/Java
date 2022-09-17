package Brain;

import java.util.Random;
import java.util.Timer;

public class Main extends Alphabet{

	public static void main(String[] args) {
		System.out.println("Bienvenue au Ribous-Land !!");
		Random hasard = new Random();
		int num = hasard.nextInt(15-0)+3;
		int letter = hasard.nextInt(25-0);
		System.out.println("Nous vous donnons l'honneur de partager avec nous un mot de "+ num +" lettres.");
		lettre();
		Character lettre = alphabet.get(letter);
		System.out.println("Le mot que vous devriez donner doit commencer par la lettre "+ lettre +".");
		System.out.println("Vous avez 30s pour répondre.");
		System.out.print("Veuillez saisir votre mot : ");
		Timer time = new Timer();
		time.schedule(new Temps(), 1000,1000);
	}

}
