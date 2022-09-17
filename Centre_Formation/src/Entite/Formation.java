package Entite;

public class Formation {
	 private int idFormation;
	private String nomFormation;
	 private String dureeFormation;
	 private String niveauFormation;
	 private String anneeFormation;
	 private String diplome;
	 private int idSection;
	public Formation(int idFormation, String nomFormation, String dureeFormation, String niveauFormation,
			String anneeFormation, String diplome, int idSection) {
		super();
		this.idFormation = idFormation;
		this.nomFormation = nomFormation;
		this.dureeFormation = dureeFormation;
		this.niveauFormation = niveauFormation;
		this.anneeFormation = anneeFormation;
		this.diplome = diplome;
		this.idSection = idSection;
	}
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	public String getDureeFormation() {
		return dureeFormation;
	}
	public void setDureeFormation(String dureeFormation) {
		this.dureeFormation = dureeFormation;
	}
	public String getNiveauFormation() {
		return niveauFormation;
	}
	public void setNiveauFormation(String niveauFormation) {
		this.niveauFormation = niveauFormation;
	}
	public String getAnneeFormation() {
		return anneeFormation;
	}
	public void setAnneeFormation(String anneeFormation) {
		this.anneeFormation = anneeFormation;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}

}
