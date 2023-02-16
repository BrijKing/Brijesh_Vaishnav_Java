package Task1;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean flag1 = true;

		HashMap<String, Integer> players = new HashMap<String, Integer>();

		while (flag1) {

			System.out.println("Enter the player name");

			String playerName = reader.readLine();

			String pipe = "|";

			System.out.println("Enter wickets - sepreted by " + pipe + "symbole.");

			String[] wickets = reader.readLine().split("\\|");

			Player p = new Player(playerName, wickets.length);

			players.put(p.getBowlerName(), p.getWicketCount());

			System.out.println("Do you wants to add another player(yes/no)");

			if (reader.readLine().equals("no")) {
				flag1 = false;
			}
			
		}

		boolean flag2 = true;

		while (flag2) {
			System.out.println("Enter the player name to search");

			String playerNameTOSearch = reader.readLine();

			if (players.get(playerNameTOSearch) == null) {
				System.out.println("No player found with the name " + playerNameTOSearch);
			}
			else {
				System.out.println("Player name :" + playerNameTOSearch);
				System.out.println("Wicket Count : " + players.get(playerNameTOSearch));
			}

			System.out.println("Do you want to search another player (yes/no)");

			if (reader.readLine().equals("no")) {
				flag2 = false;
			}
		}

	}
}
