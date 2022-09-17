package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ajout {

	public Ajout() {
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
	
	public JPanel sec(){
		//String nom, chef, secre, pers;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(6,2, 10, 5));
		JLabel l1 = new JLabel("Nom de section :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Chef de section :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Secretaire :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Personnel :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		return panel;
	}
	

	public JPanel form() {
		//String nom, duree,niveau,annee, diplome;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(7,2, 10, 5));
		JLabel l1 = new JLabel("Nom de formation :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Durée de formation :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Niveau de formation :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Année de formation :",SwingConstants.CENTER);
		JLabel l5 = new JLabel("Diplome de formation :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		JTextField t5 = new JTextField(SwingConstants.CENTER);
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
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(l5);
		panel.add(t5);
		return panel;
	}
	
	public JPanel cla() {
		//String nom, nbe, nbm, niveau;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(6,2, 10, 5));
		JLabel l1 = new JLabel("Nom de classe :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Nombre d'étudiants :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Nombre de matières :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Niveau de classe :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		return panel;
	}
	
	public JPanel pro(){
		//String prenom, nom, grade, age, genre;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(8,2, 10, 5));
		JLabel l1 = new JLabel("Prénom :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Nom :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Grade :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Age :",SwingConstants.CENTER);
		JLabel l5 = new JLabel("Genre :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		JTextField t5 = new JTextField(SwingConstants.CENTER);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
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
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(l5);
		panel.add(t5);
		return panel;
	}
	
	public JPanel etu(){
		//String prenom, nom, classe, age, genre;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(7,2, 10, 5));
		JLabel l1 = new JLabel("Prénom :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Nom :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Classe :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Age :",SwingConstants.CENTER);
		JLabel l5 = new JLabel("Genre :",SwingConstants.CENTER);
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
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		JTextField t5 = new JTextField(SwingConstants.CENTER);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(l5);
		panel.add(t5);
		
		return panel;
	}
	
	public JPanel matos() {
		//String nom, date, prop;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Nom du matériel :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Date de procuration :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Nom propriétaire :",SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		return panel;
	}
	
	public JPanel mat() {
		//String nom;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(7,2, 10, 5));
		JLabel l1 = new JLabel("Nom du matériel :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		return panel;
	}
	
	public JPanel ex(){
		//String mat,rang,  duree, type, date, prof;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(7,2, 10, 5));
		JLabel l1 = new JLabel("Nom matière :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Rang :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Durée :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Type :",SwingConstants.CENTER);
		JLabel l5 = new JLabel("Date :",SwingConstants.CENTER);
		JLabel l6 = new JLabel("Professeur :",SwingConstants.CENTER);
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
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		JTextField t5 = new JTextField(SwingConstants.CENTER);
		JTextField t6 = new JTextField(SwingConstants.CENTER);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
		t6.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(l5);
		panel.add(t5);
		panel.add(l6);
		panel.add(t6);
		return panel;
	}
	
	public JPanel no(){
		//String etu,val, mention, mat;
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5,2, 10, 5));
		JLabel l1 = new JLabel("Nom étudiant :",SwingConstants.CENTER);
		JLabel l2 = new JLabel("Valeur :",SwingConstants.CENTER);
		JLabel l3 = new JLabel("Mention :",SwingConstants.CENTER);
		JLabel l4 = new JLabel("Examen :",SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l2.setFont(new Font("Roboto", Font.ITALIC,18));
		l2.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l3.setFont(new Font("Roboto", Font.ITALIC,18));
		l3.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		l4.setFont(new Font("Roboto", Font.ITALIC,18));
		l4.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		JTextField t2 = new JTextField(SwingConstants.CENTER);
		JTextField t3 = new JTextField(SwingConstants.CENTER);
		JTextField t4 = new JTextField(SwingConstants.CENTER);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);

		return panel;
	}
}
