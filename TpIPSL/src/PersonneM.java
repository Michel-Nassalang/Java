
public class PersonneM {

	private String nom;
	private Montre montre;
	
	public PersonneM(String nom) {
		this.nom = nom;
	}
	public PersonneM(String nom, Montre montre) {
		this.nom = nom;
		this.montre = montre;
	}
	
	public String getNom(){
		return this.nom;
	}
	public Montre getMontre() {
		if(this.montre!= null) {
			return this.montre;
		}
		else {
			return null;
		}
	}
	public void setNom(String name) {
		this.nom = name;
	}
	
	public void setMontre(Montre mt) { // donner une montre
		if((this.montre == null) && (mt.mn == null)) {
			mt.mn = this;
			this.montre = mt;
			
		}
		else {
			System.out.println("La personne détient déjà une montre.");
		}
	}
	
	public void enleverMontre() { // fonction enlever une montre
		if(this.montre != null) {
			this.montre = null;
		}
	}
	
	public void demanderHeure(PersonneM personne){
		if(personne.montre != null) {
			System.out.println("Moi, " + personne.nom + " il fait " + Integer.toString(personne.montre.getHeure()) + " : " + Integer.toString(personne.montre.getMinutes()) + " chez moi.");
		}
		else {
			System.out.println("Désolé j'ai pas une montre avec moi.");
		}
	}
	
}
