
public class Responsable extends Employe{
	
	Employe employe[];

	public Responsable(String nom, String matricule, float indice, Employe employe[]) {
		super(nom, matricule, indice);
		this.employe = employe;
	}
	
	public String listing(Responsable r) {
		String liste = "";
		System.out.println("------------------------");
		System.out.println("Les employés directs du responsable "+ r.getNom() +" sont : ");
		for(int i=0; i<r.employe.length; i++){
			r.employe[i].afficher();
			liste = liste + r.employe[i].getNom() + ", ";
		}
		System.out.println("------------------------");
		return liste;
	}
	public String listingindirect(Responsable r) {
		String liste = "";
		System.out.println("--------------------------------------------------------");
		System.out.println("Les employés indirects du responsable "+ r.getNom() +" sont : ");
		for(int i=0; i<r.employe.length; i++){
			if(r.employe[i].getClass().getSimpleName() == "Responsable") {
				listingindirect((Responsable)r.employe[i]);
				liste = liste + listing((Responsable) r.employe[i]);
			}else {
				r.employe[i].afficher();
			}
			liste = liste + r.employe[i].getNom() + ", ";
		}
		System.out.println("--------------------------------------------------------");
		return liste;
		
	}
	
	public void directafficher(){
		System.out.println(super.getNom() + " est le responsable direct des employés suivants: " + listing(this));
	}
	public void indirectafficher() {
		System.out.println(super.getNom()+" est le responsable indirect des employés suivants: " + listingindirect(this));
	}

}
