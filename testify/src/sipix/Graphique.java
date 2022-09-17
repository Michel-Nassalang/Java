package sipix;

import javax.swing.*;

public class Graphique 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
        JLabel label = new JLabel("Je suis un zéro to héro", JLabel.CENTER);
        frame.add(label);
    }
}
