package Brain;

import java.util.Scanner;
import java.util.TimerTask;

public class Temps extends TimerTask  {


	int second = 10;
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		String mot = sc.nextLine();
		
		if(mot.length() == 0 || second == 0) {
			System.out.println("Désolé, Time is up !!, Vous n\'avez pas réussi.");
		}else {
			System.out.println("Merci pour votre réponse.");
		}
		second--;
	}

}
