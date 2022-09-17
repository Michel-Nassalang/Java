package Partie3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class Convertisseur {

	public static double value1;
	public static double value2;
	public static double value3;
	public static double result;
	
	private static JPanel pan() {
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4,3, 20,5));
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();

		JButton button = new JButton("Convertir");
		JButton reset = new JButton(" ← ");
		JLabel lab1 = new JLabel("Prix en Fcfa :");
		JLabel lab2 = new JLabel("Prix en dollar :");
		JLabel lab3 = new JLabel("Prix en Euro :");
		JLabel lab0 = new JLabel("", SwingConstants.CENTER);
		lab0.setPreferredSize(new Dimension(600,30));
		
		text1.setPreferredSize(new Dimension(150,30));
		text2.setPreferredSize(new Dimension(150,30));
		text3.setPreferredSize(new Dimension(150,30));
		text3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char i = e.getKeyChar();
				if(((i<'0') || (i>'9')) && (i!=KeyEvent.VK_BACK_SPACE) && (i!='.')) {
					e.consume();
				}
			}
		});
		text2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char i = e.getKeyChar();
				if(((i<'0') || (i>'9')) && (i!=KeyEvent.VK_BACK_SPACE) && (i!='.')) {
					e.consume();
				}
			}
		});
		text1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char i = e.getKeyChar();
				if(((i<'0') || (i>'9')) && (i!=KeyEvent.VK_BACK_SPACE) && (i!='.')) {
					e.consume();
				}
			}
		});
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!text1.getText().equals("")) {
						value1 =  Double.parseDouble(text1.getText());
						value2 = value1 / 550;
						value3 = value1 / 650;
						text2.setText(String.valueOf(value2));
						text3.setText(String.valueOf(value3));
					}else if(!text2.getText().equals("")){
						value2 =  Double.parseDouble(text2.getText());
						value1 = value2 * 550;
						value3 = value2 / 0.88;
						text1.setText(String.valueOf(value1));
						text3.setText(String.valueOf(value3));
					}else if(!text3.getText().equals("")) {
						value3 =  Double.parseDouble(text3.getText());
						value1 = value3 * 650;
						value2 = value3 * 0.88;
						text1.setText(String.valueOf(value1));
						text2.setText(String.valueOf(value2));
					}
				}catch(java.lang.NumberFormatException error) {
					lab0.setText("Veuillez donner une valeur à convertir !!!");
				}
			}
			
		});
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
			}
			
		});
		pan.add(lab1);
		pan.add(text1);
		pan.add(lab2);
		pan.add(text2);
		pan.add(lab3);
		pan.add(text3);
		pan.add(button);
		pan.add(reset);
		return pan;
	}
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JFrame frame = new JFrame("Convertisseur");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel lab = new JLabel("Conversion en CFA, en dollar et en euro :", SwingConstants.CENTER);
		lab.setPreferredSize(new Dimension(600,30));
		panel.add(lab);
		panel.add(pan());
		frame.add(panel);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
