
public class InstancesMaisonPersonne {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maison M1 = new Maison(150);
		Personne P1 = new Personne("Edgar Seamons");
		Porte porte1 = new Porte("rouge");
		Maison M2 = new Maison(245);
		Personne P2 = new Personne("Abdoul Razack");
		Porte porte2 = new Porte("bleu ciel");
		M1.setPorte(porte1);
		P1.setHome(M1);
		P1.info();
		P2.info();
		Appartement A1 = new Appartement();
		A1.Afficher();

	}

}
