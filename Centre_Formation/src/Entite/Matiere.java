package Entite;

public class Matiere {
	private int idMatiere;
	private String libelleMatiere;
	public Matiere(int idMatiere, String libelleMatiere) {
		super();
		this.idMatiere = idMatiere;
		this.libelleMatiere = libelleMatiere;
	}
	public int getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getLibelleMatiere() {
		return libelleMatiere;
	}
	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}

}
