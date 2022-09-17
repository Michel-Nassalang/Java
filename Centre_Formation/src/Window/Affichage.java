package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.*;

import Database.Database;
import Entite.*;

public class Affichage extends JFrame{

	private static final long serialVersionUID = 1L;

	public Affichage() {
		
	}
	
	public JPanel afficheSec() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Section> stock = base.initialSection("select * from section");
		Iterator<Section> it = stock.iterator();
		String[] column = {"Id Section","Chef de section","Secretaire","Personnel","Nom de section"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Section sec = (Section) it.next();
			list.add(new String[] {String.valueOf(sec.getIdSection()),
					sec.getChef(),sec.getSecretaire(),String.valueOf(sec.getPersonnel()),
					sec.getLibelleSection()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table,BorderLayout.CENTER);
		return panel;
	}

	public JPanel afficheFor() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Formation> stock = base.initialFormation("select * from formation");
		Iterator<Formation> it = stock.iterator();
		String[] column = {"Id Formation","Nom de formation","Durée de formation","Année de formation","Diplome"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Formation form = (Formation) it.next();
			list.add(new String[] {String.valueOf(form.getIdFormation()),
					form.getNomFormation(),form.getDureeFormation(),form.getNiveauFormation(),form.getAnneeFormation(),form.getDiplome()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table,BorderLayout.CENTER);
		return panel;
	}

	public JPanel afficheCla() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Classe> stock = base.initialClasse("select * from classe");
		Iterator<Classe> it = stock.iterator();
		String[] column = {"Id Classe","Nom","Nombre étudiants","Nombre matières","Niveau"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Classe cla = (Classe) it.next();
			list.add(new String[] {String.valueOf(cla.getIdClasse()),cla.getLibelleClasse(),String.valueOf(cla.getNb_etudiants()), String.valueOf(cla.getNb_matiere()), cla.getNiveauClasse()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table,BorderLayout.CENTER);
		return panel;
	}
	
	public JPanel affichePro() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Professeur> stock = base.initialPro("select professeur.idProfesseur, personne.prenom, personne.nom, professeur.grade, personne.age, personne.genre from professeur, personne where personne.idPersonne = professeur.idPersonne");
		Iterator<Professeur> it = stock.iterator();
		String[] column = {"Id Professeur","Prénom","Nom","Grade","Age","Genre"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Professeur pro = (Professeur) it.next();
			list.add(new String[] {String.valueOf(pro.getIdProfesseur()),pro.getPrenom(),pro.getNom(), pro.getGrade(), String.valueOf(pro.getAge()), pro.getGenre()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table,BorderLayout.CENTER);
		return panel;
	}
	
	public JPanel afficheEtu() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Etudiant> stock = base.initialEtu("select etudiant.codeEtudiant, personne.prenom, personne.nom, classe.libelleClasse, personne.age, personne.genre from classe, etudiant, personne where personne.idPersonne=etudiant.idPersonne and classe.idClasse=etudiant.idClasse");
		Iterator<Etudiant> it = stock.iterator();
		String[] column = {"Id Etudiant","Prenom","Nom","Classe","Age", "Genre"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Etudiant etu = (Etudiant) it.next();
			list.add(new String[] {String.valueOf(etu.getCodeEtudiant()),etu.getPrenom(),etu.getNom(), etu.getLibelleClasse(), String.valueOf(etu.getAge()), etu.getGenre()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table,BorderLayout.CENTER);
		return panel;
	}
	public JPanel afficheMatos() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Materiel> stock = base.initialMatos("select materiel.numero_serie, materiel.libelleMateriel, materiel.dateProcuration, personne.prenom, personne.nom from personne, materiel where personne.idPersonne=materiel.idPersonne");
		Iterator<Materiel> it = stock.iterator();
		String[] column = {"Numero de Serie","Nom matériel","Date de procuration","Prénom du Propriétaire","Nom du Propriétaire"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Materiel matos = (Materiel) it.next();
			list.add(new String[] {String.valueOf(matos.getNumero_serie()),matos.getLibelleMateriel(),matos.getDateProcuration(),matos.getPrenom(), matos.getNom()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table, BorderLayout.CENTER);
		return panel;
	}
	public JPanel afficheMater() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Matiere> stock = base.initialMat("select * from matiere");
		Iterator<Matiere> it = stock.iterator();
		String[] column = {"Id de matière","Nom matière"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Matiere mater = (Matiere) it.next();
			list.add(new String[] {String.valueOf(mater.getIdMatiere()),mater.getLibelleMatiere()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table, BorderLayout.CENTER);
		return panel;
	}
	public JPanel afficheEx() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Examen> stock = base.initialEx("select matiere.libelleMatiere, examen.libelleExamen, examen.dureeExamen, examen.typeExamen, examen.dateExamen, personne.prenom,personne.nom from personne, professeur, examen, matiere where personne.idPersonne=professeur.idPersonne and professeur.idProfesseur=examen.idProfesseur and matiere.idMatiere=examen.idMatiere;");
		Iterator<Examen> it = stock.iterator();
		String[] column = {"Matière","Rang","Durée","Type","Date","Nom professeur"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Examen exam = (Examen) it.next();
			list.add(new String[] {exam.getMatiere(),exam.getExam(),exam.getDuree(),exam.getType(),exam.getDate(),exam.getNom()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table, BorderLayout.CENTER);
		return panel;
	}
	public JPanel afficheNote() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		Database base = new Database();
		Collection<Note> stock = base.initialNote("select note.codeNote, note.valeurNote, note.mention, matiere.libelleMatiere, personne.prenom, personne.nom from note, personne, matiere, etudiant, examen where personne.idPersonne=etudiant.idPersonne and matiere.idMatiere=examen.idMatiere and etudiant.codeEtudiant=note.codeEtudiant and examen.codeExamen=note.codeExamen");
		Iterator<Note> it = stock.iterator();
		String[] column = {"Code","Valeur","Mention","Matière","Nom Etudiant"};
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(it.hasNext()) {
			Note note = (Note) it.next();
			list.add(new String[] {String.valueOf(note.getCodeNote()),String.valueOf(note.getValeurNote()),note.getMention(),note.getLibelle(),note.getNom()});
		}
		String[][] data = list.stream().toArray(String[][]::new);
		JTable table = new JTable(data,column);
		panel.add(table.getTableHeader(),BorderLayout.PAGE_START);
		panel.add(table, BorderLayout.CENTER);
		return panel;
	}
}
