package Task2;

import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Match> matches = new ArrayList<Match>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
				
			System.out.println("Enter match date in(yyyy-MM-dd");
			String date = sc.next();
			
			System.out.println("Enter Team 1");
			String team1 = sc.next();
			
			System.out.println("Enter Team 2");
			String team2 = sc.next();
			
			Match match = new Match(LocalDate.parse(date), team1, team2);
			
			matches.add(match);
			
		}
		
		Collections.sort(matches);
		
		System.out.println(matches);
		
	}
}
