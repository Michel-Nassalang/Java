package Interfaces;
import javax.swing.*;
import java.awt.*;

public class Fenetre1{
	/**
	 * 
	 */
	private boolean sens = true;
	public void change() {
		if(sens == true) {
			sens = false;
		}else {
			sens = true;
		}
	}
	public static void main(String[] argv) {
		JFrame fenetre = new JFrame("Espace Etudiant IPSL");
		fenetre.setSize(700,600);
		JButton btn = new JButton("Bouton IPSL");
		JLabel label = new JLabel("Acceuil IPSL");
		JButton btn2 = new JButton("Cours");
		JLabel label2 = new JLabel("Bonjour chèr(e) étudiant(e)");
		fenetre.getContentPane().add(label2);
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
	public boolean isSens() {
		return sens;
	}
	public void setSens(boolean sens) {
		this.sens = sens;
	}

}
