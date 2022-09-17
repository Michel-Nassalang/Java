package sipix;

public class objets {

	public static void main(String[] args) {
		Assasin assasin1 = new Assasin("Mike", 100, 87, 94);
		System.out.println("Le nom du premier assasin est: "+ assasin1.getNom());
		assasin1.setNom("Edgar");
		System.out.println("Le nouveau nom du premier assasin est: "+ assasin1.getNom());
		System.out.println("Le gilet est: "+ assasin1.getGilet());
		assasin1.resetgilet(44);
		System.out.println("Le gilet est: "+ assasin1.getGilet());
	}
	
}
