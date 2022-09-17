package Entite;

public class Section {
	private int idSection;
	private String chef;
	private String secretaire;
	private int personnel;
	private String libelleSection;
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public String getSecretaire() {
		return secretaire;
	}
	public void setSecretaire(String secretaire) {
		this.secretaire = secretaire;
	}
	public int getPersonnel() {
		return personnel;
	}
	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}
	public String getLibelleSection() {
		return libelleSection;
	}
	public void setLibelleSection(String libelleSection) {
		this.libelleSection = libelleSection;
	}
	public Section(int idSection, String chef, String secretaire, int personnel, String libelleSection) {
		super();
		this.idSection = idSection;
		this.chef = chef;
		this.secretaire = secretaire;
		this.personnel = personnel;
		this.libelleSection = libelleSection;
	}

}
