package Interfaces;
import javax.swing.*;
import java.awt.event.*;

public class Listener{
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
		JPanel panel1  = new JPanel();
		JPanel panel2 = new JPanel();
		//JTogggleButton
		//JTextComponent
		//JTextField
		//JTextArea
		panel1.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fenetre.setContentPane(panel1);
		JMenuBar menuBar = new JMenuBar();
		fenetre.setJMenuBar(menuBar);
		JMenu acceuil = new JMenu("Acceuil");
		JMenu scol = new JMenu("Scolarité");
		menuBar.add(acceuil);
		menuBar.add(scol);
		JMenu menu = new JMenu("Informations");
		menuBar.add(menu);
		fenetre.setVisible(true);
	}
	

}
