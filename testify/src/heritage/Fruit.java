package heritage;

public abstract class Fruit {
	public void dicton(){
		System.out.println("On a un fruit de nature : " + this.name);
	}
	public abstract void gout();
	public abstract void sens();
	String name;
	String contry;
	int code;
	public Fruit(String nom, String pays, int code) {
		this.name = nom;
		this.contry = pays;
		this.code = code;
	}
	public String getNom() {
		return name;
	}
	public void setNomN(String nom) {
		this.name = nom;
	}
	public String getPays() {
		return contry;
	}
	public void setNomP(String pays) {
		this.contry = pays;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
