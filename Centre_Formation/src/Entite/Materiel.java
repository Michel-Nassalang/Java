package Entite;

public class Materiel {

	private int numero_serie;
	private String libelleMateriel;
	private String dateProcuration;
	private String prenom;
	private String nom;
	public Materiel(int numero_serie, String libelleMateriel, String dateProcuration, String prenom, String nom) {
		super();
		this.numero_serie = numero_serie;
		this.libelleMateriel = libelleMateriel;
		this.dateProcuration = dateProcuration;
		this.prenom = prenom;
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(int numero_serie) {
		this.numero_serie = numero_serie;
	}
	public String getLibelleMateriel() {
		return libelleMateriel;
	}
	public void setLibelleMateriel(String libelleMateriel) {
		this.libelleMateriel = libelleMateriel;
	}
	public String getDateProcuration() {
		return dateProcuration;
	}
	public void setDateProcuration(String dateProcuration) {
		this.dateProcuration = dateProcuration;
	}
	
}
