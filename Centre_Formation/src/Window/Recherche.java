package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class Recherche {

	public Recherche() {
	}
	private String value = "";
	private Boolean error = false;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}

	public JLabel label = new JLabel("", SwingConstants.CENTER);
	public JPanel fenetre() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		return panel;
	}
	
	public JPanel sec(String nom, String chef, String secre, String pers) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(4,2, 10, 5));
		JLabel l1 = new JLabel("Nom de section :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Chef de section :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(chef,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Secretaire :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(secre,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Personnel :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(pers,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		return panel;
	}
	

	public JPanel form(String nom, String duree, String niveau, String annee, String diplome) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Nom de formation :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Durée de formation :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(duree,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Niveau de formation :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(niveau,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Année de formation :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(annee,SwingConstants.CENTER);
		JLabel l9 = new JLabel("Diplome de formation :",SwingConstants.CENTER);
		JLabel l0 = new JLabel(diplome,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l9.setFont(new Font("Roboto", Font.ITALIC,18));
		l9.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l0.setFont(new Font("Roboto", Font.ITALIC,18));
		l0.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		return panel;
	}
	
	public JPanel cla(String nom, String nbe, String nbm, String niveau) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(4,2, 10, 5));
		JLabel l1 = new JLabel("Nom de classe :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Nombre d'étudiants :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(String.valueOf(nbe),SwingConstants.CENTER);
		JLabel l5 = new JLabel("Nombre de matières :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(String.valueOf(nbm),SwingConstants.CENTER);
		JLabel l7 = new JLabel("Niveau de classe :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(niveau,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		return panel;
	}
	
	public JPanel pro(String prenom, String nom, String grade, String age, String genre){
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Prénom :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(prenom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Nom :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Grade :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(grade,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Age :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(age,SwingConstants.CENTER);
		JLabel l9 = new JLabel("Genre :",SwingConstants.CENTER);
		JLabel l0 = new JLabel(genre,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l9.setFont(new Font("Roboto", Font.ITALIC,18));
		l9.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l0.setFont(new Font("Roboto", Font.ITALIC,18));
		l0.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(l9);
		panel.add(l0);
		return panel;
	}
	
	public JPanel etu(String prenom, String nom, String classe, String age, String genre){
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Prénom :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(prenom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Nom :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Classe :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(classe,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Age :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(age,SwingConstants.CENTER);
		JLabel l9 = new JLabel("Genre :",SwingConstants.CENTER);
		JLabel l0 = new JLabel(genre,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l9.setFont(new Font("Roboto", Font.ITALIC,18));
		l9.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l0.setFont(new Font("Roboto", Font.ITALIC,18));
		l0.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(l9);
		panel.add(l0);
		return panel;
	}
	
	public JPanel matos(String nom, String date, String prop) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(4,2, 10, 5));
		JLabel l1 = new JLabel("Nom du matériel :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(nom,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Date de procuration :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(date,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Nom propriétaire :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(prop,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		return panel;
	}
	
	public JPanel mat(String nom) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2, 10, 5));
		JLabel l1 = new JLabel("Nom de matière :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(nom,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		return panel;
	}
	
	public JPanel ex(String mat, String rang, String duree, String type, String date, String prof){
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(6,2, 10, 5));
		JLabel l1 = new JLabel("Nom matière :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(mat,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Rang :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(rang,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Durée :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(duree,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Type :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(type,SwingConstants.CENTER);
		JLabel l9 = new JLabel("Date :",SwingConstants.CENTER);
		JLabel l0 = new JLabel(date,SwingConstants.CENTER);
		JLabel l11 = new JLabel("Professeur :",SwingConstants.CENTER);
		JLabel l12 = new JLabel(prof,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l9.setFont(new Font("Roboto", Font.ITALIC,18));
		l9.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l0.setFont(new Font("Roboto", Font.ITALIC,18));
		l0.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l11.setFont(new Font("Roboto", Font.ITALIC,18));
		l11.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l12.setFont(new Font("Roboto", Font.ITALIC,18));
		l12.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(l9);
		panel.add(l0);
		panel.add(l11);
		panel.add(l12);
		return panel;
	}
	
	public JPanel no(String etu, String val, String mention, String mat){
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Nom étudiant :",SwingConstants.CENTER);
		JLabel l2 = new JLabel(etu,SwingConstants.CENTER);
		JLabel l3 = new JLabel("Valeur :",SwingConstants.CENTER);
		JLabel l4 = new JLabel(val,SwingConstants.CENTER);
		JLabel l5 = new JLabel("Mention :",SwingConstants.CENTER);
		JLabel l6 = new JLabel(mention,SwingConstants.CENTER);
		JLabel l7 = new JLabel("Matériel :",SwingConstants.CENTER);
		JLabel l8 = new JLabel(mat,SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l5.setFont(new Font("Roboto", Font.ITALIC,18));
		l5.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l6.setFont(new Font("Roboto", Font.ITALIC,18));
		l6.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l7.setFont(new Font("Roboto", Font.ITALIC,18));
		l7.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l8.setFont(new Font("Roboto", Font.ITALIC,18));
		l8.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		return panel;
	}
	
}
