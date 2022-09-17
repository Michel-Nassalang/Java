
public class ClasseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour chers etudiants");
		int a = 1;
		int note = 15;
		if(a==1) {
			System.out.println("Je suis en ING 1 INFO");
		}else {
			System.out.println("Je suis de la ING 2 INFO");
		}
		
		if (note>=10 && note <12) {
			System.out.println("Passer");
			System.out.println("Mention : Passable");
			}
		else if(note>=12 && note <15) {
			System.out.println("Passer");
			System.out.println("Mention : Assez bien");
		}
		else if(note>=15 && note <17) {
			System.out.println("Passer");
			System.out.println("Mention : Très bien");
		}
		else if(note>=17 && note <=20) {
			System.out.println("Passer");
			System.out.println("Mention : Excellent");
		}
		else {
			System.out.println("Redoubler");
			System.out.println("Mention : faible");
		}
	}

}