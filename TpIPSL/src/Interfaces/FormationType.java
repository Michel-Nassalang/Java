package Interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;

public class FormationType extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormationType() {
		super("Centre de Formation");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/nature.jpg"));
		this.setIconImage(icon.getImage());
		JPanel contentPane = (JPanel) this.getContentPane();
		JPanel contentGlass = (JPanel) this.getGlassPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(ScrollView(),BorderLayout.WEST);
		contentPane.add(ToolBar(),BorderLayout.NORTH);
		contentGlass.add(panelVenue());
		contentGlass.add(panelsuite());
	}
	private JScrollPane ScrollView() {
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Institut");
		DefaultMutableTreeNode info = new DefaultMutableTreeNode("Informations");
		DefaultMutableTreeNode affiche = new DefaultMutableTreeNode("Affichage");
		DefaultMutableTreeNode recherche = new DefaultMutableTreeNode("Recherche");
		DefaultMutableTreeNode ajout = new DefaultMutableTreeNode("Ajout");
		DefaultMutableTreeNode modif = new DefaultMutableTreeNode("Modification");
		DefaultMutableTreeNode suppress = new DefaultMutableTreeNode("Suppression");
		rootNode.add(info);
		rootNode.add(affiche);
		rootNode.add(recherche);
		rootNode.add(ajout);
		rootNode.add(modif);
		rootNode.add(suppress);
		DefaultMutableTreeNode gen = new DefaultMutableTreeNode("Généralités");
		info.add(gen);
		DefaultMutableTreeNode infoclass = new DefaultMutableTreeNode("Classes");
		affiche.add(infoclass);
		DefaultMutableTreeNode infoetu = new DefaultMutableTreeNode("Etudiants");
		affiche.add(infoetu);
		DefaultMutableTreeNode infoprof = new DefaultMutableTreeNode("Professeurs");
		affiche.add(infoprof);
		DefaultMutableTreeNode infoexam = new DefaultMutableTreeNode("Examens");
		affiche.add(infoexam);
		DefaultMutableTreeNode infofor = new DefaultMutableTreeNode("Formations");
		affiche.add(infofor);
		DefaultMutableTreeNode infomat = new DefaultMutableTreeNode("Matériels");
		affiche.add(infomat);
		DefaultMutableTreeNode infomateriel = new DefaultMutableTreeNode("Matières");
		affiche.add(infomateriel);
		DefaultMutableTreeNode infosec = new DefaultMutableTreeNode("Sections");
		affiche.add(infosec);
		DefaultMutableTreeNode rechnom = new DefaultMutableTreeNode("Personnes");
		recherche.add(rechnom);
		DefaultMutableTreeNode rechmat = new DefaultMutableTreeNode("Matières");
		recherche.add(rechmat);
		DefaultMutableTreeNode rechclass = new DefaultMutableTreeNode("Classes");
		recherche.add(rechclass);
		DefaultMutableTreeNode rechfor = new DefaultMutableTreeNode("Formations");
		recherche.add(rechfor);
		DefaultMutableTreeNode rechsec = new DefaultMutableTreeNode("Sections");
		recherche.add(rechsec);
		DefaultMutableTreeNode rechmateriel = new DefaultMutableTreeNode("Matériels");
		recherche.add(rechmateriel);
		DefaultMutableTreeNode rechnote = new DefaultMutableTreeNode("Notes Etudiant");
		recherche.add(rechnote);
		//ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/tree.png"));
		JTree elements = new JTree(rootNode);
		//DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) elements.getCellRenderer();
		//renderer.setLeafIcon(imageIcon);
		JScrollPane scroll = new JScrollPane(elements);
		scroll.setPreferredSize(new Dimension(175,0));
		return scroll;
	}
	private JToolBar ToolBar() {
		JToolBar toolbar = new JToolBar();
		toolbar.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Centre de Formation");
		titre.setFont(new Font("Forte", Font.PLAIN,16));
		toolbar.add(titre, BorderLayout.WEST);
		JTextField recherche = new JTextField("Rechercher ...");
		recherche.setPreferredSize(new Dimension(125,28));
		toolbar.add(recherche, BorderLayout.EAST);
		return toolbar;
	}
	private JPanel panelVenue() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1, 20,5));
		JLabel mot = new JLabel("Bienvenue chèr(e) étudiant(e) !!!", SwingConstants.CENTER);
		mot.setFont(new Font("Forte", Font.BOLD,25));
		mot.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		JLabel mots = new JLabel("Nous vous souhaitons la bienvenue dans le centre de Formation Cogito !!!", SwingConstants.CENTER);
		mots.setFont(new Font("Forte", Font.PLAIN,18));
		panel.add(mot, BorderLayout.CENTER);
		panel.add(mots, BorderLayout.CENTER);
		return panel;
	}
	private JPanel panelsuite() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel imgLab = new JLabel();
		imgLab.setPreferredSize(new Dimension(350,300));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/nature.jpg"));
		Image image = img.getImage();
		Image imgscale = image.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		ImageIcon simg = new ImageIcon(imgscale);
		imgLab.setIcon(simg);
		panel.add(imgLab, BorderLayout.CENTER);
		return panel;
	}
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		FormationType acceuil = new FormationType();
		acceuil.setVisible(true);
	}

}
