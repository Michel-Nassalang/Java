package Interfaces;
import javax.swing.*;
import java.awt.*;

public class Fenetre2{
	/**
	 * 
	 */
	public static void main(String[] argv) {
		JFrame fenetre = new JFrame("Espace Etudiant IPSL");
		fenetre.setSize(700,600);
		JButton btn = new JButton("Bouton IPSL");
		JLabel label = new JLabel("Acceuil IPSL");
		JButton btn2 = new JButton("Cours");
		JLabel label2 = new JLabel("Bonjour chèr(e) étudiant(e)");
		JLabel foc = new JLabel("Etes vous un étudiant de l'ipsl ?");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JLabel onglet1 =new  JLabel("Classe");
		JLabel onglet2 = new JLabel("Cours");
		JLabel onglet3 = new JLabel("Matière");
		JTextArea com1 = new JTextArea("Commentaires classe");
		JTextArea com2 = new JTextArea("Commentaires cours");
		JTextArea com3 = new JTextArea("Commentaires matière");
		com1.setPreferredSize(new Dimension(400,300));
		com2.setPreferredSize(new Dimension(400,300));
		com3.setPreferredSize(new Dimension(400,300));
		panel1.setPreferredSize(new Dimension(600,500));
		panel2.setPreferredSize(new Dimension(600,500));
		panel3.setPreferredSize(new Dimension(600,500));
		panel1.add(label2);
		panel2.add(label2);
		panel3.add(label2);
		panel1.add(onglet1);
		panel2.add(onglet2);
		panel3.add(onglet3);
		panel1.add(com1);
		panel2.add(com2);
		panel3.add(com3);
		onglets.addTab("Classe", panel1);
		onglets.addTab("Cours", panel2);
		onglets.addTab("Matière", panel3);
		//onglets.setOpaque(true);
		panel.add(onglets);
		fenetre.setContentPane(panel);
		fenetre.setVisible(true);
		JOptionPane.showMessageDialog(null, "Bonjour");
		JOptionPane.showConfirmDialog(null, foc);
		JOptionPane.showInputDialog("Votre nom et prénom");
	}
	

}
