
public class Montre {

	private int heure;
	private int minutes;
	PersonneM mn;

	
	public Montre(int heure, int minutes) {
		this.heure = heure;
		this.minutes = minutes;
	}
	public Montre(Montre cartex) {
		this.heure = cartex.heure;
		this.minutes = cartex.minutes;
	}
	
	public int getHeure() {
		return this.heure;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public void setHeure(int nb){
		this.heure = nb;
	}
	
	public void setMinutes(int nb){
		this.minutes = nb;
	}
	
	public void ajouterMinute(int nem){
		int total = getMinutes() + nem;
		if(total < 59) {
			setMinutes(total);
		}
		else {
			int a = 60 - getMinutes();
			int b = nem - a;
			if(getHeure() == 23) {
				setMinutes(b);
				setHeure(0);
			}
			else {
				setMinutes(b);
				setHeure(getHeure() + 1);
			}
		}
		
		System.out.println("La nouvelle heure est : " + getHeure() + " : " + getMinutes());
		
	}
	public void affichage() {
		System.out.println("La montre est à : " + getHeure() + " : " + getMinutes());
	}
	

}
