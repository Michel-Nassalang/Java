
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


public class Calculatrice {
	public static String calcul(String input) {
		String number = "";
		double result = 0.1434634276878565;
		String[] valeur;
		String[] operateur = {"+","-","×","÷"};
		if(input.contains(operateur[0])) {
			valeur = input.split(operateur[0]);
		}else if(input.contains(operateur[1])) {
			valeur = input.split(operateur[1]);
		}else if(input.contains(operateur[2])) {
			valeur = input.split(operateur[2]);
		}else if(input.contains(operateur[3])) {
			valeur = input.split(operateur[3]);
		}else {
			valeur = null;
		}
		if(valeur != null && valeur.length == 2) {
			double value1 = Double.parseDouble(valeur[0]);
			double value2 = Double.parseDouble(valeur[1]);
			if(input.contains(operateur[0])) {
				result = value1 + value2;
			}else if(input.contains(operateur[1])) {
				result = value1 - value2;
			}else if(input.contains(operateur[2])) {
				result = value1 * value2;
			}else if(input.contains(operateur[3])) {
				result = value1 / value2;
			}else {
				result = 0.1434634276878565;
			}
		}else {
			number = " Votre opération n'est pas correcte.";
		}
		if(result!=0.1434634276878565) {
			number = String.valueOf(result);
		}else {
			number = " Votre opération n'est pas correcte.";
		}
		return number;
	}
	public static void main(String[] argv) {
		JFrame frame = new JFrame("Calculatrice");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton button = new JButton(" = ");
		JTextArea area = new JTextArea();
		JButton b0 = new JButton(" 0 ");
		JButton b1 = new JButton(" 1 ");
		JButton b2 = new JButton(" 2 ");
		JButton b3 = new JButton(" 3 ");
		JButton b4 = new JButton(" 4 ");
		JButton b5 = new JButton(" 5 ");
		JButton b6 = new JButton(" 6 ");
		JButton b7 = new JButton(" 7 ");
		JButton b8 = new JButton(" 8 ");
		JButton b9 = new JButton(" 9 ");
		JButton bp = new JButton(" . ");
		JButton bplus = new JButton(" + ");
		JButton bmoins = new JButton(" - ");
		JButton bmul = new JButton(" × ");
		JButton bdiv = new JButton(" ÷ ");
		JButton beff = new JButton(" ← ");
		area.addKeyListener(new KeyAdapter() {
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
				area.setText(area.getText() + " = " + calcul(area.getText()));
			}
		});
		bplus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "+");
			}
		});
		bmoins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "-");
			}
		});
		bmul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "×");
			}
		});
		bdiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "÷");
			}
		});
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("0");	
			}
		});
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "1");	
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "2");	
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "3");	
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "4");	
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "5");	
			}
		});
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "6");	
			}
		});
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "7");	
			}
		});
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "8");	
			}
		});
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + "9");	
			}
		});
		bp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(area.getText() + ".");
				
			}
		});
		beff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
		area.setPreferredSize(new Dimension(250,100));
		panel.add(area);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bp);
		panel.add(bplus);
		panel.add(bmoins);
		panel.add(bmul);
		panel.add(bdiv);
		panel.add(beff);
		panel.add(button);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
