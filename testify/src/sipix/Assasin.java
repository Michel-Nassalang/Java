package sipix;

public class Assasin {
	private String nom;
	private int sante;
	private int force;
	private int gilet;
	
	public Assasin(String name, int sante, int force, int gilet) {
	this.setNom(name) ;
	this.setSante(sante);
	this.setForce(force);
	this.setGilet(gilet);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getGilet() {
		return gilet;
	}
	public int resetgilet(int res) {
		this.gilet = this.gilet - res;
		return gilet;
	}

	public void setGilet(int gilet) {
		this.gilet = gilet;
	}
	
}
