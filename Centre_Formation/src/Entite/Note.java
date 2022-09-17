package Entite;

public class Note {
	private int codeNote;
	private float valeurNote;
	private String mention;
	private String libelle;
	private String nom;
	public int getCodeNote() {
		return codeNote;
	}
	public void setCodeNote(int codeNote) {
		this.codeNote = codeNote;
	}
	public float getValeurNote() {
		return valeurNote;
	}
	public void setValeurNote(float valeurNote) {
		this.valeurNote = valeurNote;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Note(int codeNote, float valeurNote, String mention, String libelle, String nom) {
		super();
		this.codeNote = codeNote;
		this.valeurNote = valeurNote;
		this.mention = mention;
		this.libelle = libelle;
		this.nom = nom;
	}
	

}
