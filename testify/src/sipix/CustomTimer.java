package sipix;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	int temps = 5;
	@Override
	public void run() {
		System.out.println("Hello guys !!   "+ temps);
		
		if(temps==0) {
			Random rand = new Random();
			int num = rand.nextInt(10 - 0);
			System.out.println("Le nombre aléatoire généré est : "+num);
			System.out.println("Au revoir !!");
			cancel();
		}
		temps--;
	}

}
