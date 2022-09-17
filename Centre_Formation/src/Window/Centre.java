package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Database.Database;
import Entite.Classe;
import Entite.Etudiant;
import Entite.Examen;
import Entite.Formation;
import Entite.Materiel;
import Entite.Matiere;
import Entite.Note;
import Entite.Professeur;
import Entite.Section;


public class Centre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void relance0() {
		this.setContentPane(interfaces());
		this.revalidate();
	}
	
	private Actions1 click = new Actions1();
	private int page = 0;
	public static String stat = "";
	public String[][] data = null;
	public class Actions1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			String text = source.getText();
			if (text.equals("Sections")) {
				page = 1;
				data = null;
			}else if(text.equals("Formations")) {
				page = 2;
				data = null;
			}else if(text.equals("Classes")) {
				page = 3;
				data = null;
			}else if(text.equals("Professeurs")) {
				page = 4;
				data = null;
			}else if(text.equals("Etudiants")) {
				page = 5;
				data = null;
			}else if(text.equals("Matériels")) {
				page = 6;
				data = null;
			}else if(text.equals("Matières")) {
				page = 7;
				data = null;
			}else if(text.equals("Examens")) {
				page = 8;
				data = null;
			}else if(text.equals("Notes")) {
				page = 9;
				data = null;
			}else {
				page = 0;
			}
			Centre.this.relance0();
		}

	}
	
	public Centre() {
		super("Centre de Formation");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/centre.png"));
		this.setIconImage(icon.getImage());
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.add(acceuil());
	}
	//------------------Acceuil--------------------
	private JPanel acceuil() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(panelVenue());
		panel.add(panelsuite());
		panel.setBackground(Color.WHITE);
		JButton button = new JButton("Visite -→");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relance0();
			}
		});
		panel.add(button);
		return panel;
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
		panel.setBackground(Color.WHITE);
		return panel;
	}
	private JPanel panelsuite() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JLabel imgLab = new JLabel();
		imgLab.setPreferredSize(new Dimension(350,300));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/centre.png"));
		Image image = img.getImage();
		Image imgscale = image.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		ImageIcon simg = new ImageIcon(imgscale);
		imgLab.setIcon(simg);
		panel.add(imgLab, BorderLayout.CENTER);
		return panel;
	}
	//------------------Acceuil--------------------
	
	//------------------Interfaces--------------------
	public JPanel interfaces() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(ScrollView(),BorderLayout.WEST);
		panel.add(ToolBar(),BorderLayout.NORTH);
		panel.add(split());
		return panel;
	}
	private JScrollPane ScrollView() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel titre = new JLabel("Centre de Formation", SwingConstants.CENTER);
		titre.setFont(new Font("Forte", Font.PLAIN,16));
		panel.add(titre, BorderLayout.NORTH);
		panel.add(panelWest());
		panel.setBackground(Color.WHITE);
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setPreferredSize(new Dimension(200,0));
		return scroll;
	}
	private JPanel panelWest() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		panel.add(gridlayout(), SwingConstants.CENTER);
		return panel;
	}
	public JPanel gridlayout() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10,1,5,5));
		panel.setBackground(Color.white);
		panel.setSize(180, HEIGHT);
		JButton sec = new JButton("Sections");
		sec.addActionListener(click);
		JButton form = new JButton("Formations");
		form.addActionListener(click);
		JButton cla = new JButton("Classes");
		cla.addActionListener(click);
		JButton prof = new JButton("Professeurs");
		prof.addActionListener(click);
		JButton etu = new JButton("Etudiants");
		etu.addActionListener(click);
		JButton mater = new JButton("Matériels");
		mater.addActionListener(click);
		JButton mat = new JButton("Matières");
		mat.addActionListener(click);
		JButton exam = new JButton("Examens");
		exam.addActionListener(click);
		JButton note = new JButton("Notes");
		note.addActionListener(click);
		JLabel ges = new JLabel("Gestion");
		ges.setPreferredSize(new Dimension(140,HEIGHT));
		ges.setFont(new Font("Roboto",Font.ITALIC,18));
		panel.add(note, SwingConstants.CENTER);
		panel.add(exam, SwingConstants.CENTER);
		panel.add(mat, SwingConstants.CENTER);
		panel.add(mater, SwingConstants.CENTER);
		panel.add(etu, SwingConstants.CENTER);
		panel.add(prof, SwingConstants.CENTER);
		panel.add(cla, SwingConstants.CENTER);
		panel.add(form, SwingConstants.CENTER);
		panel.add(sec, SwingConstants.CENTER);
		panel.add(ges, SwingConstants.CENTER);
		return panel;
	}
	private JSplitPane split() {
		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, onepart(),twopart());
		split.setResizeWeight(0.30);
		return split;
	}
	public JPanel onepart() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		if(page == 0) {
			panel.add(accroche(), SwingConstants.CENTER);
		}else if(page == 1) {
			panel.add(onSections());
		}else if(page == 2) {
			panel.add(onFormations());
		}else if(page == 3) {
			panel.add(onClasses());
		}else if(page == 4) {
			panel.add(onProfesseurs());
		}else if(page == 5) {
			panel.add(onEtudiants());
		}else if(page == 6) {
			panel.add(onMateriels());
		}else if(page == 7) {
			panel.add(onMatieres());
		}else if(page == 8) {
			panel.add(onExamens());
		}else if(page == 9) {
			panel.add(onNotes());
		}else {
			panel.add(accroche());
		}
		return panel;
	}
	public JScrollPane twopart() {
		JScrollPane scroll = new JScrollPane(element());
		scroll.setBackground(Color.WHITE);
		
		return scroll;
	}

	public JLabel titre = new JLabel("", SwingConstants.CENTER);
	public JPanel card() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JLabel mot = new JLabel("Cogito", SwingConstants.CENTER);
		mot.setFont(new Font("Forte", Font.BOLD,25));
		mot.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		mot.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(mot);
		titre.setFont(new Font("Roboto", Font.BOLD,22));
		titre.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		titre.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(titre);
		return panel;
	}
	public  JPanel element() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(card());
		Affichage aff = new Affichage();
		Recherche rech = new Recherche();
		Ajout aj = new Ajout();
		Modification modif = new Modification();
		if(stat.equals("affSec")) {
			titre.setText("Nos sections");
			panel.add(aff.afficheSec());
		}else if(stat.equals("affFor")) {
			titre.setText("Nos formations");
			panel.add(aff.afficheFor());
		}else if(stat.equals("affCla")) {
			titre.setText("Nos classes");
			panel.add(aff.afficheCla());
		}else if(stat.equals("affPro")) {
			titre.setText("Nos professeurs");
			panel.add(aff.affichePro());
		}else if(stat.equals("affEtu")) {
			titre.setText("Nos étudiants");
			panel.add(aff.afficheEtu());
		}else if(stat.equals("affMatos")) {
			titre.setText("Nos matériels");
			panel.add(aff.afficheMatos());
		}else if(stat.equals("affMat")) {
			titre.setText("Nos matières");
			panel.add(aff.afficheMater());
		}else if(stat.equals("affEx")) {
			titre.setText("Les examens réalisés");
			panel.add(aff.afficheEx());
		}else if(stat.equals("affNo")) {
			titre.setText("Les notes des étudiants");
			panel.add(aff.afficheNote());
		}else if(stat.equals("rechSec")) {
			titre.setText("Recherche de Section");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.sec(data[i][4], data[i][1], data[i][2], data[i][3]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechFor")) {
			titre.setText("Recherche de Formation");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.form(data[i][1], data[i][2], data[i][3], data[i][4],data[i][5]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechCla")) {
			titre.setText("Recherche de Classe");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.cla(data[i][0], data[i][1], data[i][2], data[i][3]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechPro")) {
			titre.setText("Recherche de Professeur");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.pro(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechEtu")) {
			titre.setText("Recherche d'étudiant");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.etu(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechMatos")) {
			titre.setText("Recherche de matériel");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.matos(data[i][0], data[i][1], data[i][2] +  " " +data[i][3]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechMat")) {
			titre.setText("Recherche de matière");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.mat(data[i][1]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechEx")) {
			titre.setText("Recherche d'examen");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.ex(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4], data[i][5]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("rechNo")) {
			titre.setText("Recherche de notes");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = rech.no(data[i][4], data[i][1], data[i][2], data[i][3]);
					panel.add(rech.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("ajSec")) {
			titre.setText("Ajout Section");
			panel.add(aj.sec());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajFor")) {
			titre.setText("Ajout Formation");
			panel.add(aj.form());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajCla")) {
			titre.setText("Ajout Classe");
			panel.add(aj.cla());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajPro")) {
			titre.setText("Ajout Professeur");
			panel.add(aj.pro());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajEtu")) {
			titre.setText("Ajout Etudiant");
			panel.add(aj.etu());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajMatos")) {
			titre.setText("Ajout Matériel");
			panel.add(aj.matos());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajMat")) {
			titre.setText("Ajout Matière");
			panel.add(aj.mat());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajEx")) {
			titre.setText("Ajout Examen");
			panel.add(aj.ex());
			panel.add(fenetreAdd());
		}else if(stat.equals("ajNo")) {
			titre.setText("Ajout Note");
			panel.add(aj.no());
			panel.add(fenetreAdd());
		}else if(stat.equals("modifSec")) {
			titre.setText("Modification de Section");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.sec(Integer.parseInt(data[i][0]),data[i][4], data[i][1], data[i][2], data[i][3]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifFor")) {
			titre.setText("Modification de Formation");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.form(data[i][1], data[i][2], data[i][3], data[i][4],data[i][5]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifCla")) {
			titre.setText("Modification de Classe");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.cla(Integer.valueOf(data[i][4]),data[i][0], data[i][1], data[i][2], data[i][3]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifPro")) {
			titre.setText("Modification de Professeur");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.pro(Integer.parseInt(data[i][5]),data[i][0], data[i][1], data[i][2], data[i][3],data[i][4]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifEtu")) {
			titre.setText("Modification d'étudiant");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.etu(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifMatos")) {
			titre.setText("Modification de matériel");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.matos(data[i][0], data[i][1], data[i][2] +  " " +data[i][3]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifMat")) {
			titre.setText("Modification de matière");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.mat(Integer.parseInt(data[i][0]),data[i][1]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifEx")) {
			titre.setText("Modification d'examen");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.ex(data[i][0], data[i][1], data[i][2], data[i][3],data[i][4], data[i][5]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}else if(stat.equals("modifNo")) {
			titre.setText("Modification de notes");
			rech.setValue("");
			panel.add(fenetre());
			if(data!=null) {
				int len = data.length;
				for(int i=0; i<len;i++) {
					JPanel pan = modif.no(Integer.parseInt(data[i][0]),data[i][4], data[i][1], data[i][2], data[i][3]);
					panel.add(modif.fenetre().add(pan),BoxLayout.Y_AXIS);
				}
			}
		}
		return panel;
	}
	private JToolBar ToolBar() {
		JToolBar toolbar = new JToolBar();
		toolbar.setLayout(new BorderLayout());
		JTextField recherche = new JTextField("Rechercher ...");
		recherche.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(recherche.getText().equals("Rechercher ...")) {
					recherche.setText("");
				}
			}
		});
		recherche.setPreferredSize(new Dimension(125,28));
		toolbar.add(recherche, BorderLayout.EAST);
		return toolbar;
	}
	
	//------------------Interfaces--------------------
	public JPanel accroche() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JLabel imgLab = new JLabel();
		imgLab.setPreferredSize(new Dimension(225,200));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/centre.png"));
		Image image = img.getImage();
		Image imgscale = image.getScaledInstance(225,200, Image.SCALE_SMOOTH);
		ImageIcon simg = new ImageIcon(imgscale);
		imgLab.setIcon(simg);
		panel.add(imgLab, BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel onSections() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JButton affSec = new JButton("Sections disponibles");
		affSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affSec";
				Centre.this.relance0();
			}
		});
		panel.add(affSec);
		JButton rechSec = new JButton("Recherche");
		rechSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechSec";
				Centre.this.relance0();
			}
		});
		panel.add(rechSec);
		JButton ajSec = new JButton("Ajout");
		ajSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajSec";
				Centre.this.relance0();
			}
		});
		panel.add(ajSec);
		JButton modifSec = new JButton("Modification");
		modifSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "modifSec";
				Centre.this.relance0();
			}
		});
		panel.add(modifSec);
		return panel;
	}
	private JPanel onFormations() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JButton affFor = new JButton("Formations disponibles");
		affFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affFor";
				Centre.this.relance0();
			}
		});
		panel.add(affFor);
		JButton rechFor = new JButton("Recherche");
		rechFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechFor";
				Centre.this.relance0();
			}
		});
		panel.add(rechFor);
		JButton ajFor = new JButton("Ajout");
		ajFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajFor";
				Centre.this.relance0();
			}
		});
		panel.add(ajFor);
		return panel;
	}
	public JPanel onClasses() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JButton affCla = new JButton("Classes");
		affCla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affCla";
				Centre.this.relance0();
			}
		});
		panel.add(affCla);
		JButton rechCla = new JButton("Recherche");
		rechCla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechCla";
				Centre.this.relance0();
			}
		});
		panel.add(rechCla);
		JButton ajCla = new JButton("Ajout");
		ajCla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajCla";
				Centre.this.relance0();
			}
		});
		panel.add(ajCla);
		JButton modifCla = new JButton("Modification");
		modifCla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "modifCla";
				Centre.this.relance0();
			}
		});
		panel.add(modifCla);
		return panel;
	}
	public JPanel onProfesseurs() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		JButton affPro = new JButton("Professeurs");
		affPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affPro";
				Centre.this.relance0();
			}
		});
		panel.add(affPro);
		JButton rechPro = new JButton("Recherche");
		rechPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechPro";
				Centre.this.relance0();
			}
		});
		panel.add(rechPro);
		JButton ajPro = new JButton("Ajout");
		ajPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajPro";
				Centre.this.relance0();
			}
		});
		panel.add(ajPro);
		JButton modifPro = new JButton("Modification");
		modifPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "modifPro";
				Centre.this.relance0();
			}
		});
		panel.add(modifPro);
		return panel;
	}
	public JPanel onEtudiants() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JButton affEtu = new JButton("Etudiants");
		affEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affEtu";
				Centre.this.relance0();
			}
		});
		panel.add(affEtu);
		JButton rechEtu = new JButton("Recherche");
		rechEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechEtu";
				Centre.this.relance0();
			}
		});
		panel.add(rechEtu);
		JButton ajEtu = new JButton("Ajout");
		ajEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajEtu";
				Centre.this.relance0();
			}
		});
		panel.add(ajEtu);
		return panel;
	}
	public JPanel onMateriels() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JButton affMat = new JButton("Matériels");
		affMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affMatos";
				Centre.this.relance0();
			}
		});
		panel.add(affMat);
		JButton rechMat = new JButton("Recherche");
		rechMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechMatos";
				Centre.this.relance0();
			}
		});
		panel.add(rechMat);
		JButton ajMat = new JButton("Ajout");
		ajMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajMatos";
				Centre.this.relance0();
			}
		});
		panel.add(ajMat);
		return panel;
	}
	public JPanel onMatieres() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JButton affMat = new JButton("Matières disponibles");
		affMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affMat";
				Centre.this.relance0();
			}
		});
		panel.add(affMat);
		JButton rechMat = new JButton("Recherche");
		rechMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechMat";
				Centre.this.relance0();
			}
		});
		panel.add(rechMat);
		JButton ajMat = new JButton("Ajout");
		ajMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajMat";
				Centre.this.relance0();
			}
		});
		panel.add(ajMat);
		JButton modifMat = new JButton("Modification");
		modifMat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "modifMat";
				Centre.this.relance0();
			}
		});
		panel.add(modifMat);
		return panel;
	}
	public JPanel onExamens() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JButton affEx = new JButton("Examens");
		affEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affEx";
				Centre.this.relance0();
			}
		});
		panel.add(affEx);
		JButton rechEx = new JButton("Recherche");
		rechEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechEx";
				Centre.this.relance0();
			}
		});
		rechEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechEx";
				Centre.this.relance0();
			}
		});
		panel.add(rechEx);
		JButton ajEx = new JButton("Ajout");
		ajEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajEx";
				Centre.this.relance0();
			}
		});
		panel.add(ajEx);
		return panel;
	}
	public JPanel onNotes() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JButton affNo = new JButton("Notes disponibles");
		affNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "affNo";
				Centre.this.relance0();
			}
		});
		panel.add(affNo);
		JButton rechNo = new JButton("Recherche");
		rechNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "rechNo";
				Centre.this.relance0();
			}
		});
		panel.add(rechNo);
		JButton ajNo = new JButton("Ajout");
		ajNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "ajNo";
				Centre.this.relance0();
			}
		});
		panel.add(ajNo);
		JButton modifNo = new JButton("Modification");
		modifNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stat = "modifNo";
				Centre.this.relance0();
			}
		});
		panel.add(modifNo);
		return panel;
	}

	public JPanel fenetre() {
		Recherche rech = new Recherche();
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		rech.setError(false);
		rech.setValue("");
		if(stat.equals("rechSec")) {
			panel.add(searchSec(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechFor")) {
			panel.add(searchFor(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechCla")) {
			panel.add(searchCla(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechPro")) {
			panel.add(searchPro(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechEtu")) {
			panel.add(searchEtu(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechMatos")) {
			panel.add(searchMatos(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechMat")) {
			panel.add(searchMater(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechEx")) {
			panel.add(searchEx(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechNo")) {
			panel.add(searchNo(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("rechNo")) {
			panel.add(searchNo(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifSec")) {
			panel.add(searchSec(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifFor")) {
			panel.add(searchFor(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifCla")) {
			panel.add(searchCla(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifPro")) {
			panel.add(searchPro(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifEtu")) {
			panel.add(searchEtu(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifMatos")) {
			panel.add(searchMatos(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifMat")) {
			panel.add(searchMater(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifEx")) {
			panel.add(searchEx(rech),BorderLayout.PAGE_START);
		}else if(stat.equals("modifNo")) {
			panel.add(searchNo(rech),BorderLayout.PAGE_START);
		}
		
		if(rech.getError() == true) { 
			rech.label.setText("Veuillez donner le nom de l'élément que vous recherchez.");
		}
		rech.label.setFont(new Font("Roboto", Font.ITALIC,14));
		panel.add(rech.label,BorderLayout.CENTER);
		return panel;
	}
	public JPanel searchSec(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher");
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de la section que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select * from section where libelleSection= \""+rech.getValue()+"\"");
						Collection<Section> stock = base.initialSection(query);
						Iterator<Section> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Section sec = (Section) it.next();
							list.add(new String[] {String.valueOf(sec.getIdSection()),
									sec.getChef(),sec.getSecretaire(),String.valueOf(sec.getPersonnel()),
									sec.getLibelleSection()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		return panel;
	}
	
	public JPanel searchFor(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher");
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de la formation que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select * from formation where nomFormation= \""+rech.getValue()+"\"");
						Collection<Formation> stock = base.initialFormation(query);
						Iterator<Formation> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Formation form = (Formation) it.next();
							list.add(new String[] {String.valueOf(form.getIdFormation()),
									form.getNomFormation(),form.getDureeFormation(),form.getNiveauFormation(),form.getAnneeFormation(),form.getDiplome()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		return panel;
	}
	
	public JPanel searchCla(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher");
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de la classe que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select * from classe where libelleClasse= \""+rech.getValue()+"\"");
						Collection<Classe> stock = base.initialClasse(query);
						Iterator<Classe> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Classe cla = (Classe) it.next();
							list.add(new String[] {cla.getLibelleClasse(),
									String.valueOf(cla.getNb_etudiants()),String.valueOf(cla.getNb_matiere()),cla.getNiveauClasse(),String.valueOf(cla.getIdClasse())});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		return panel;
	}
	
	public JPanel searchPro(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par nom");
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom du professeur que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select professeur.idProfesseur, personne.prenom, personne.nom, professeur.grade, personne.age, personne.genre from professeur, personne where personne.idPersonne=professeur.idPersonne and personne.prenom =\""+rech.getValue()+"\"");
						Collection<Professeur> stock = base.initialPro(query);
						Iterator<Professeur> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Professeur pro = (Professeur) it.next();
							list.add(new String[] {pro.getPrenom(),
									pro.getNom(), pro.getGrade(), String.valueOf(pro.getAge()), pro.getGenre(),String.valueOf(pro.getIdProfesseur())});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		return panel;
	}
	
	public JPanel searchEtu(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par nom");
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom d'étudiant que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select etudiant.codeEtudiant, personne.prenom, personne.nom, classe.libelleClasse, personne.age, personne.genre from classe, etudiant, personne where personne.idPersonne=etudiant.idPersonne and classe.idClasse=etudiant.idClasse and personne.prenom=\""+rech.getValue()+"\"");
						Collection<Etudiant> stock = base.initialEtu(query);
						Iterator<Etudiant> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Etudiant etu = (Etudiant) it.next();
							list.add(new String[] {etu.getPrenom(),
									etu.getNom(), etu.getLibelleClasse(), String.valueOf(etu.getAge()), etu.getGenre()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		return panel;
	}
	
	public JPanel searchMatos(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par nom");
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de matériel que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						String query = String.valueOf("select materiel.numero_serie, materiel.libelleMateriel, materiel.dateProcuration, personne.prenom, personne.nom from personne, materiel where personne.idPersonne=materiel.idPersonne and materiel.libelleMateriel=\""+rech.getValue()+"\"");
						Collection<Materiel> stock = base.initialMatos(query);
						Iterator<Materiel> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Materiel matos = (Materiel) it.next();
							list.add(new String[] {matos.getLibelleMateriel(),
									matos.getDateProcuration(), matos.getPrenom(), matos.getNom()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		return panel;
	}
	
	public JPanel searchMater(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par nom");
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de matière que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						Collection<Matiere> stock = base.initialMat("select * from matiere where libelleMatiere=\""+rech.getValue()+"\"");
						Iterator<Matiere> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Matiere mater = (Matiere) it.next();
							list.add(new String[] {String.valueOf(mater.getIdMatiere()),mater.getLibelleMatiere()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;  
							Centre.this.relance0();
						}
					}
				}
			}
		});
		return panel;
	}
	
	public JPanel searchEx(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par matière");
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de l'examen que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						Collection<Examen> stock = base.initialEx("select matiere.libelleMatiere, examen.libelleExamen, examen.dureeExamen, examen.typeExamen, examen.dateExamen, personne.prenom,personne.nom from personne, professeur, examen, matiere where personne.idPersonne=professeur.idPersonne and professeur.idProfesseur=examen.idProfesseur and matiere.idMatiere=examen.idMatiere and matiere.libelleMatiere=\""+rech.getValue()+"\"");
						Iterator<Examen> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Examen exam = (Examen) it.next();
							list.add(new String[] {exam.getMatiere(),exam.getExam(),exam.getDuree(),exam.getType(),exam.getDate(),exam.getNom()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		return panel;
	}
	
	public JPanel searchNo(Recherche rech) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par étudiant");
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					rech.setError(true);
					rech.label.setText("Veuillez donner le nom de la note que vous recherchez.");
				}else{
					rech.setValue(search.getText());
					if(!rech.getValue().equals("")) {
						Database base = new Database();
						Collection<Note> stock = base.initialNote("select note.codeNote, note.valeurNote, note.mention, matiere.libelleMatiere, personne.prenom, personne.nom from note, personne, matiere, etudiant, examen where personne.idPersonne=etudiant.idPersonne and matiere.idMatiere=examen.idMatiere and etudiant.codeEtudiant=note.codeEtudiant and examen.codeExamen=note.codeExamen and personne.prenom=\""+rech.getValue()+"\"");
						Iterator<Note> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Note note = (Note) it.next();
							list.add(new String[] {String.valueOf(note.getCodeNote()),String.valueOf(note.getValeurNote()),note.getMention(),note.getLibelle(),note.getNom()});
						}
						if(list.isEmpty()) {
							rech.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							rech.label.setText(rech.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		return panel;
	}
	public JPanel addSec(Ajout aj) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(1,2,25,25));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JTextField search = new JTextField();
		search.setFont(new Font("Roboto", Font.ITALIC,16));
		search.setPreferredSize(new Dimension(150,30));
		JButton click = new JButton("Rechercher par étudiant");
		panel.add(click, SwingConstants.CENTER);
		panel.add(search, SwingConstants.CENTER);
		click.setFont(new Font("Roboto", Font.ITALIC,16));
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(search.getText().equals("")) {
					aj.setError(true);
					aj.label.setText("Veuillez donner le nom de la note que vous recherchez.");
				}else{
					aj.setValue(search.getText());
					if(!aj.getValue().equals("")) {
						Database base = new Database();
						Collection<Note> stock = base.initialNote("select note.codeNote, note.valeurNote, note.mention, matiere.libelleMatiere, personne.prenom, personne.nom from note, personne, matiere, etudiant, examen where personne.idPersonne=etudiant.idPersonne and matiere.idMatiere=examen.idMatiere and etudiant.codeEtudiant=note.codeEtudiant and examen.codeExamen=note.codeExamen and personne.prenom=\""+aj.getValue()+"\"");
						Iterator<Note> it = stock.iterator();
						ArrayList<String[]> list = new ArrayList<String[]>();
						while(it.hasNext()) {
							Note note = (Note) it.next();
							list.add(new String[] {String.valueOf(note.getCodeNote()),String.valueOf(note.getValeurNote()),note.getMention(),note.getLibelle(),note.getNom()});
						}
						if(list.isEmpty()) {
							aj.setValue("Nous n'avons pas de résultat pour votre recherche. \n Veuillez revoir votre recherche.");
							aj.label.setText(aj.getValue());
						}else {
							String[][] data = list.stream().toArray(String[][]::new);
							Centre.this.data = data;
							Centre.this.relance0();
						}
					}
				}
			}
		});
		return panel;
	}
	
	public JPanel fenetreAdd() {
		Ajout aj = new Ajout();
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		aj.setError(false);
		aj.setValue("");
		JButton bou = new JButton("Ajouter");
		if(stat.equals("ajSec")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajFor")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajCla")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajPro")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajEtu")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajMatos")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajMat")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajEx")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}else if(stat.equals("ajNo")) {
			bou.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		
		if(aj.getError() == true) { 
			aj.label.setText("Veuillez donner le nom de l'élément que vous recherchez.");
		}
		aj.label.setFont(new Font("Roboto", Font.ITALIC,14));
		panel.add(aj.label,BorderLayout.CENTER);
		panel.add(bou,SwingConstants.CENTER);
		return panel;
	}
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Centre acceuil = new Centre();
		acceuil.setVisible(true);
	}

}
