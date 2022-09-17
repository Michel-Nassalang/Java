package Entite;

public class Examen {
	private String matiere;
	private String exam;
	private String duree;
	private String type;
	private String date;
	private String nom;
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Examen(String matiere, String exam, String duree, String type, String date, String nom) {
		super();
		this.matiere = matiere;
		this.exam = exam;
		this.duree = duree;
		this.type = type;
		this.date = date;
		this.nom = nom;
	}
	

}
