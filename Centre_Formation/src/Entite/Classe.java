package Entite;

public class Classe {
	private int idClasse;
	private String libelleClasse;
	private int nb_etudiants;
	private int nb_matiere;
	private String niveauClasse;
	private int idForamation;
	
	public Classe(int idClasse, String libelleClasse, int nb_etudiants, int nb_matiere, String niveauClasse,
			int idForamation) {
		super();
		this.idClasse = idClasse;
		this.libelleClasse = libelleClasse;
		this.nb_etudiants = nb_etudiants;
		this.nb_matiere = nb_matiere;
		this.niveauClasse = niveauClasse;
		this.idForamation = idForamation;
	}
	
	public Classe(String libelleClasse, int nb_etudiants, int nb_matiere, String niveauClasse) {
		super();
		this.libelleClasse = libelleClasse;
		this.nb_etudiants = nb_etudiants;
		this.nb_matiere = nb_matiere;
		this.niveauClasse = niveauClasse;
	}

	public Classe(String libelleClasse, int nb_etudiants, int nb_matiere) {
		super();
		this.libelleClasse = libelleClasse;
		this.nb_etudiants = nb_etudiants;
		this.nb_matiere = nb_matiere;
	}

	public int getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	public String getLibelleClasse() {
		return libelleClasse;
	}
	public void setLibelleClasse(String libelleClasse) {
		this.libelleClasse = libelleClasse;
	}
	public int getNb_etudiants() {
		return nb_etudiants;
	}
	public void setNb_etudiants(int nb_etudiants) {
		this.nb_etudiants = nb_etudiants;
	}
	public int getNb_matiere() {
		return nb_matiere;
	}
	public void setNb_matiere(int nb_matiere) {
		this.nb_matiere = nb_matiere;
	}
	public String getNiveauClasse() {
		return niveauClasse;
	}
	public void setNiveauClasse(String niveauClasse) {
		this.niveauClasse = niveauClasse;
	}
	public int getIdForamation() {
		return idForamation;
	}
	public void setIdForamation(int idForamation) {
		this.idForamation = idForamation;
	}

}
