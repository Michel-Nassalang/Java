package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Database.Database;

public class Modification {

	public Modification() {
	}
	public JLabel label = new JLabel("", SwingConstants.CENTER);
	public JPanel fenetre() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		return panel;
	}
	public JPanel sec(int id,String nom, String chef, String secre, String pers){
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
		t1.setText(nom);
		t2.setText(chef);
		t3.setText(secre);
		t4.setText(pers);
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
		JButton button = new JButton("Modifier");
		JLabel j = new JLabel("",SwingConstants.CENTER);
		j.setFont(new Font("Roboto", Font.ITALIC,18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database base = new Database();
				String query = "UPDATE "+"section SET chef=\""+t2.getText()+"\", secretaire=\""+t3.getText()+"\", personnel=\""+t4.getText()+"\" WHERE idSection="+id;
				base.ajour(query);
				j.setText("Mis à jour");
			}
		});
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(j);
		panel.add(button);
		return panel;
	}
	

	public JPanel form(String nom, String duree, String niveau, String annee, String diplome) {
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
		t1.setText(nom);
		t2.setText(duree);
		t3.setText(niveau);
		t4.setText(annee);
		t5.setText(diplome);
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
		JButton button = new JButton("Modifier");
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
		panel.add(button);
		return panel;
	}
	
	public JPanel cla(int id,String nom, String nbe, String nbm, String niveau) {
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
		t1.setText(nom);
		t2.setText(nbe);
		t3.setText(nbm);
		t4.setText(niveau);
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
		JButton button = new JButton("Modifier");
		JLabel j = new JLabel("",SwingConstants.CENTER);
		j.setFont(new Font("Roboto", Font.ITALIC,18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database base = new Database();
				String query = "UPDATE classe SET libelleClasse=\""+t1.getText()+"\", nb_etudiants=\""+t2.getText()+"\", nb_matiere=\""+t3.getText()+"\", niveauClasse=\""+t4.getText()+"\" WHERE idClasse="+id;
				base.ajour(query);
				j.setText("Mis à jour");
			}
		});
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(j);
		panel.add(button);
		return panel;
	}
	
	public JPanel pro(int id, String prenom, String nom, String grade, String age, String genre){
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
		t1.setText(prenom);
		t2.setText(nom);
		t3.setText(grade);
		t4.setText(age);
		t5.setText(genre);
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
		JButton button = new JButton("Modifier");
		JLabel j = new JLabel("",SwingConstants.CENTER);
		j.setFont(new Font("Roboto", Font.ITALIC,18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database base = new Database();
				String query = "UPDATE professeur SET grade=\"" + t3.getText() + "\" WHERE idProfesseur="+id;
				base.ajour(query);
				j.setText("Mis à jour");
			}
		});
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
		panel.add(j);
		panel.add(button);
		return panel;
	}
	
	public JPanel etu(String prenom, String nom, String classe, String age, String genre){
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
		t1.setText(prenom);
		t2.setText(nom);
		t3.setText(classe);
		t4.setText(age);
		t5.setText(genre);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
		JButton button = new JButton("Modifier");
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
		panel.add(button);
		return panel;
	}
	
	public JPanel matos(String nom, String date, String prop) {
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
		JButton button = new JButton("Modifier");
		t1.setText(nom);
		t2.setText(date);
		t3.setText(prop);
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(button);
		return panel;
	}
	
	public JPanel mat(int id, String nom) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(7,2, 10, 5));
		JLabel l1 = new JLabel("Nom de matière :",SwingConstants.CENTER);
		JTextField t1 = new JTextField(SwingConstants.CENTER);
		l1.setFont(new Font("Roboto", Font.ITALIC,18));
		l1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t1.setText(nom);
		JButton button = new JButton("Modifier");
		JLabel j = new JLabel("",SwingConstants.CENTER);
		j.setFont(new Font("Roboto", Font.ITALIC,18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database base = new Database();
				String query = "UPDATE "+"matiere SET libelleMatiere=\""+t1.getText()+"\" WHERE idMatiere="+id;
				base.ajour(query);
				j.setText("Mis à jour");
			}
		});
		panel.add(l1);
		panel.add(t1);
		panel.add(j);
		panel.add(button);
		return panel;
	}
	
	public JPanel ex(String mat, String rang, String duree, String type, String date, String prof){
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
		t1.setText(mat);
		t2.setText(rang);
		t3.setText(duree);
		t4.setText(type);
		t4.setText(date);
		t5.setText(prof);
		t1.setFont(new Font("Roboto", Font.ITALIC,18));
		t2.setFont(new Font("Roboto", Font.ITALIC,18));
		t3.setFont(new Font("Roboto", Font.ITALIC,18));
		t4.setFont(new Font("Roboto", Font.ITALIC,18));
		t5.setFont(new Font("Roboto", Font.ITALIC,18));
		t6.setFont(new Font("Roboto", Font.ITALIC,18));
		JButton button = new JButton("Modifier");
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
		panel.add(button);
		return panel;
	}
	
	public JPanel no(int id, String etu, String val, String mention, String mat){
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
		t1.setText(etu);
		t2.setText(val);
		t3.setText(mention);
		t4.setText(mat);
		JButton button = new JButton("Modifier");
		JLabel j = new JLabel("",SwingConstants.CENTER);
		j.setFont(new Font("Roboto", Font.ITALIC,18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database base = new Database();
				String query = "UPDATE note SET valeurNote=\""+t2.getText()+"\", mention=\""+t3.getText()+"\" WHERE codeNote="+id;
				base.ajour(query);
				j.setText("Mis à jour");
			}
		});
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(j);
		panel.add(button);
		return panel;
	}
}
