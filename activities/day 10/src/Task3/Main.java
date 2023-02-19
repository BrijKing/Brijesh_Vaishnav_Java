package Task3;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, ParseException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Player> playerList = new ArrayList<>();
		System.out.println("Enter the number of players:");
		int numberOfPlayers = Integer.parseInt(reader.readLine());
		for (int i = 0; i < numberOfPlayers; i++) {
			playerList.add(new Player().createPlayer(reader.readLine()));
		}
		System.out.println("Enter a type to sort");
		System.out.println("1.Sort by number of matches played");
		System.out.println("2.Sort by runs scored");
		System.out.println("3.Sort by power rating");
		switch (Integer.parseInt(reader.readLine())) {
		case 1: {
			Collections.sort(playerList);
			for (Player i : playerList) {
				System.out.println(i);
			}
			break;

		}
		case 2: {
			Collections.sort(playerList, new Comparator<Player>() {

				@Override
				public int compare(Player o1, Player o2) {
					// TODO Auto-generated method stub
					return o1.getRuns() - o2.getRuns();
				}
			});
			for (Player i : playerList) {
				System.out.println(i);
			}
			break;
		}

		case 3: {
			Collections.sort(playerList, new Comparator<Player>() {

				@Override
				public int compare(Player o1, Player o2) {
					// TODO Auto-generated method stub
					return (int) (o2.getPowerRating() - o1.getPowerRating());
				}
			});
			for (Player i : playerList) {
				System.out.println(i);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + Integer.parseInt(reader.readLine()));
		}

	}

}
