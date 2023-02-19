package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the Team:");
		String TeamName = reader.readLine();
		List<Player> players = new ArrayList<Player>();
		Team team = new Team(TeamName, players);

		boolean flag = true;
		while (flag) {

			System.out.println("1.Add Player");
			System.out.println("2.Delete Player");
			System.out.println("3.Display Player");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			Player player = new Player();

			int choice = Integer.parseInt(reader.readLine());
			switch (choice) {
			case 1: {
				System.out.println("Enter the detail of player in CSV format:");
				String PlayerDetail = reader.readLine();

				team.addPlayerToTeam(player.createPlayer(PlayerDetail));
				break;
			}

			case 2: {
				System.out.println("Enter the name of player to be deleted:");
				String name = reader.readLine();
				team.removePlayerFromTeam(name);

				break;
			}
			case 3: {
				team.displayPlayers();
				break;
			}
			case 4: {
				flag = false;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

}
