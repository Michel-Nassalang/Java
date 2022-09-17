package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Entite.*;
public class Database {
	private String user = "e-learning";
	private String password = "learning";
	private String base = "jdbc:mysql://localhost:3306/centre_formation";
	//private String query;
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public Collection<Classe> initialClasse(String query) {
		Collection<Classe> classe = new ArrayList<Classe>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Classe cl = new Classe(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
				classe.add(cl);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return classe;
	}
	public Collection<Section> initialSection(String query) {
		Collection<Section> section = new ArrayList<Section>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Section sec = new Section(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				section.add(sec);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return section;
	}
	public Collection<Formation> initialFormation(String query) {
		Collection<Formation> formation = new ArrayList<Formation>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Formation form = new Formation(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				formation.add(form);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return formation;
	}
	public Collection<Professeur> initialPro(String query) {
		Collection<Professeur> professeur = new ArrayList<Professeur>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Professeur prof = new Professeur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				professeur.add(prof);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return professeur;
	}
	public Collection<Etudiant> initialEtu(String query) {
		Collection<Etudiant> etudiant = new ArrayList<Etudiant>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Etudiant etu = new Etudiant(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				etudiant.add(etu);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return etudiant;
	}
	public Collection<Materiel> initialMatos(String query) {
		Collection<Materiel> materiel = new ArrayList<Materiel>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Materiel matos = new Materiel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				materiel.add(matos);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return materiel;
	}
	public Collection<Matiere> initialMat(String query) {
		Collection<Matiere> matiere = new ArrayList<Matiere>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Matiere mater = new Matiere(rs.getInt(1), rs.getString(2));
				matiere.add(mater);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return matiere;
	}
	public Collection<Examen> initialEx(String query) {
		Collection<Examen> examen = new ArrayList<Examen>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Examen exam = new Examen(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)+" "+rs.getString(7));
				examen.add(exam);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return examen;
	}
	public Collection<Note> initialNote(String query) {
		Collection<Note> notes = new ArrayList<Note>();
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				Note note = new Note(rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getString(4),rs.getString(5)+" "+rs.getString(6));
				notes.add(note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}
	public String ajour(String query) {
		String fact;
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			state.executeUpdate(query);
			fact = "ajour";
		}catch(SQLException e) {
			e.printStackTrace();
			fact = "pasajour";
		}
		return fact;
	}
}
