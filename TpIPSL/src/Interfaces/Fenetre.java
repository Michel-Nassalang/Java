package Interfaces;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;

public class Fenetre extends JFrame{
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
	private static final long serialVersionUID = -7830109194125067492L;
	public Fenetre() {
		super("1er interface IPSL");
	
	WindowListener fenetre = new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	};
	addWindowListener(fenetre);
	setSize(700,600);
	JButton btn = new JButton("Bouton IPSL");
	JLabel label = new JLabel("Acceuil IPSL");
	JPanel panel = new JPanel();
	JButton btn2 = new JButton("Cours");
	JLabel label2 = new JLabel("Bonjour chèr(e) étudiant(e)");
	JCheckBox sexe1 = new JCheckBox("Death");
	JCheckBox sexe2 = new JCheckBox("Life",true);
	JRadioButton radio1 = new JRadioButton("Age: moins de 12ans");
	JRadioButton radio2 = new JRadioButton("Age: plus de 12ans et moins de 18ans");
	JRadioButton radio3 = new JRadioButton("Age: plus de 18ans");
	JRadioButton radio4 = new JRadioButton("masculin");
	JRadioButton radio5 = new JRadioButton("féminin");
	JTextField text1 = new JTextField("saisir");
	JPasswordField pass1 = new JPasswordField();
	ButtonGroup Bgroup1 =  new ButtonGroup();
	ButtonGroup Bgroup2 = new ButtonGroup();
	JTextArea tarea1 = new JTextArea("Commentaires");
	text1.setPreferredSize(new Dimension(200,20));
	pass1.setPreferredSize(new Dimension(100,20));
	tarea1.setPreferredSize(new Dimension(500,200));
	text1.setSize(20, 5);
	panel.add(label);
	panel.add(btn);
	panel.add(label2); 
	panel.add(btn2);
	panel.add(sexe1);
	panel.add(sexe2);
	Bgroup1.add(radio1);
	Bgroup1.add(radio2);
	Bgroup1.add(radio3);
	Bgroup2.add(radio4);
	Bgroup2.add(radio5);
	panel.add(radio1);
	panel.add(radio2);
	panel.add(radio3);
	panel.add(radio4);
	panel.add(radio5);
	panel.add(text1);
	panel.add(pass1);
	panel.add(tarea1);
	setContentPane(panel);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		JFrame fenetre = new Fenetre();
	}
	public boolean isSens() {
		return sens;
	}
	public void setSens(boolean sens) {
		this.sens = sens;
	}

}
