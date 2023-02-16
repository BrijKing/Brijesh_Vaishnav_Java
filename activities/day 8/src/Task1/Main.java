package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Player> playerDetails = new ArrayList<Player>();
		System.out.println("Please provide the number of players to be registerd");

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("Please enter player name");

			String name = sc.next();

			System.out.println("Please select the skill of player");

			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");

			int skills = sc.nextInt();

			String skill;

			switch (skills) {
			case 1: {

				skill = "All Rounder";
				break;
			}
			case 2: {

				skill = "Batsman";
				break;
			}
			case 3: {

				skill = "Bowler";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + skills);
			}
			
			playerDetails.add(new Player(name, skill));

		}
		
		PlayerComparator pc=new PlayerComparator();
		Collections.sort(playerDetails,pc);
		
		for(int i = 0; i < playerDetails.size(); i++) {
			System.out.println(playerDetails.get(i));
		}
		
		

	}

}
