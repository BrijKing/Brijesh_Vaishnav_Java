package Task2;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Team> team = new ArrayList<Team>();
		
	    System.out.println("Enter number of teams:");
	    int numberOfTeams =Integer.parseInt(reader.readLine()); 
	    for(int i = 1; i<=numberOfTeams; i++) {
	    	System.out.println("Enter team "+ i + " detail");
	    	System.out.println("Enter Name");
	    	String teamName = reader.readLine();
	    	
	    	System.out.println("Enter number of matches");
	    	long numberOfMatches = Long.parseLong(reader.readLine()) ;
	    	
	    	team.add(new Team(teamName,numberOfMatches ));
	    }
	    
	    TeamComparator tc = new TeamComparator();
	    Collections.sort(team, tc );
	    
	    for(Object i : team) {
	    	System.out.println(i);
	    }
	
	}
	
}

