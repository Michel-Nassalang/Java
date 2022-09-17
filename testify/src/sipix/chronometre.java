package sipix;

import java.util.Timer;

public class chronometre {
	public static void main(String[] args) {
		Timer chrono = new Timer();
		chrono.schedule(new CustomTimer(), 1000, 1000);
	}

}
