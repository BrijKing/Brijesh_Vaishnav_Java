package Task1;

import java.sql.*;
import java.util.*;

public class PlayerDAO {
	private static Connection makeConnection()  {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment13", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public List<Player> getAllPlayers(){
		ArrayList<Player> li = new ArrayList<>();
		Connection con = makeConnection();
		if(con == null) {
			return li;
		}
		String query = "select * from player";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				li.add(new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		return li;
	}
}
