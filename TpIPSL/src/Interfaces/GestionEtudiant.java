package Interfaces;

import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GestionEtudiant{

	public static void main(String[] argv) {
		JFrame frame = new JFrame("Calculatrice");
		frame.setSize(600,500);
		JPanel panel = new JPanel();
		JLabel text1 = new JLabel("Bienvenue chèr étudiant de l'IPSL");
		JLabel name = new JLabel("NOM : ");
		JTextField nom = new JTextField();
		JLabel surname = new JLabel("Prénom : ");
		JTextField prenom = new JTextField();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		name.setPreferredSize(new Dimension(50,30));
		nom.setPreferredSize(new Dimension(150,30));
		surname.setPreferredSize(new Dimension(50,30));
		prenom.setPreferredSize(new Dimension(150,30));
		panel.add(text1);
		panel.add(name);
		panel.add(nom);
		panel.add(surname);
		panel.add(prenom);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}