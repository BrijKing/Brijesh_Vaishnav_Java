package task4;
import task3.CustomException;
import java.util.*;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] teams = {"Chennai Super Kings",
				"Sun Risers",
				"Delhi Daredevils",
				"Kings XI Punjab",
				"Kolkata Knight Riders",
				"Mumbai Indians",
				"Rajasthan Royals",
				"Royal Challengers Bangalore"};
		int flagw = 0, flagr = 0;
		
		
		try {
			System.out.println("Enter the expected winner team of IPL Season 10");
			String winner = s.nextLine();
			System.out.println("Enter the expected runner team of IPL Season 10");
			String runner = s.nextLine();
			for(String team:teams) {
				if(winner.equals(team)) {
					flagw = 1;
					break;
				}
				
			}
			
						
			for(String team:teams) {
				if(runner.equals(team)) {
					flagr = 1;
					break;
				}
				
			}
			
			if(flagw == 0 || flagr == 0) {
				throw new CustomException("TeamNameNotFoundException: Entered team is not a part of IPL Season 1");
			}
			
			System.out.println("Expected IPL Season 10 winner: " + winner);
			System.out.println("Expected IPL Season 10 runner: " + runner);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		
//		
		
		
		
		
		
		
		

		
		
		

	}

}
