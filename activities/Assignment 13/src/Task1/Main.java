package Task1;

import java.sql.*;

public class Main {
	public static void main(String[] args) throws SQLException {
		PlayerDAO pd= new PlayerDAO();
		
		for(Player i : pd.getAllPlayers()) {
			System.out.println(i);
		}
	}
}
