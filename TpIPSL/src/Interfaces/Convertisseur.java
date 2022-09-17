package Interfaces;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Convertisseur {

	public static double value1;
	public static double value2;
	public static double taux = 0;
	public static double result;
	public static void main(String[] argv) {
		JFrame frame = new JFrame("Convertisseur");
		frame.setSize(600,500);
		JPanel panel = new JPanel();
		JButton button = new JButton("Convertir");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JLabel lab = new JLabel("               Convertissez en donnant les variables demandées :");
		JLabel lab1 = new JLabel("Prix à convertir");
		JLabel lab2 = new JLabel("Prix converti");
		JLabel lab3 = new JLabel("Taux de conversion");
		lab.setPreferredSize(new Dimension(600,30));
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
					if(!text1.getText().equals("") && text2.getText().equals("")) {
						value1 =  Double.parseDouble(text1.getText());
						taux = Double.parseDouble(text3.getText());
						result = taux * value1;
						text2.setText(String.valueOf(result));
					}else if(!text2.getText().equals("") && text1.getText().equals("")){
						value2 =  Double.parseDouble(text2.getText());
						taux = Double.parseDouble(text3.getText());
						result = value2 / taux;
						text1.setText(String.valueOf(result));
					}
				}catch(java.lang.NumberFormatException error) {
					lab.setText("               Veuillez donner la valeur à convertir et le taux de conversion !!!");
				}
			}
		});
		panel.add(lab);
		panel.add(lab1);
		panel.add(text1);
		panel.add(lab2);
		panel.add(text2);
		panel.add(button);
		panel.add(lab3);
		panel.add(text3);
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
