package heritage;

public class Main {

	public static void main(String[] args) {
		Orange orange1 = new Orange("orange","Sénégal",3);
		lemon lemon1 = new lemon("Lemon","France", 2);
		lemon1.dicton();
		orange1.dicton();  
		lemon1.gout();
		orange1.gout();
		System.out.println(lemon1.getNom());
		System.out.println("Le fruit est une " + orange1.getNom() + " récoltée au " + orange1.getPays() + " avec un niveau de satisfaction de " + orange1.getCode());
		if(!(lemon1 instanceof Interface)) {
			System.out.println("Le lemon n\'est une instance de l\'interface");
		}else {
			System.out.println("Le lemon est une instance de l\'interface");
		}
		System.out.println("Il fait "+ journey.matin+ ", il est "+ journey.matin.getheure() + "h.");
		for(journey moment : journey.values()) {
			System.out.println("Il fait "+ moment+ ", il est "+ moment.getheure() + "h.");
		}
	}

}
