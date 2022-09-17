

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC {

	public static void main(String[] args) throws SQLException{
		String user = "root";
		String password = "";
		String base = "jdbc:mysql://localhost:3306/kay_ndougou";
		String query = "Select * from adresse";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(base, user, password);
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				String select = "";
				for(int i=1;i<3;i++) {
					select += rs.getString(i) + " : ";
				}
				System.out.println(select);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
