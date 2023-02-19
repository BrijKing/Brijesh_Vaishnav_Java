package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Players:");
		int n = Integer.parseInt(reader.readLine());
		Player player = new Player();
		PlayerBO pb = new PlayerBO();
		List<Player> playerList = new ArrayList<Player>();
		for (int i = 0; i < n; i++) {
			String playerDetail = reader.readLine();
			playerList.add(player.createPlayer(playerDetail));
		}
		System.out.println("Enter a search type:");
		System.out.println("1.By Nationality");
		System.out.println("2.By Date of Birth");
		System.out.println("3.By Power Rating");
		int choise = Integer.parseInt(reader.readLine());
		switch (choise) {
		case 1: {
			System.out.println("Enter the Nationality:");
			String nationality = reader.readLine();
			for (Player i : pb.findPlayer(playerList, nationality)) {
				System.out.println(i);
			}

			break;
		}
		case 2: {
			System.out.println("Enter the Date of Birth");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date dob = format.parse(reader.readLine());
			for (Player i : pb.findPlayer(playerList, dob)) {
				System.out.println(i);
			}

			break;

		}
		case 3: {
			System.out.println("Enter the Power Rating:");
			double pr = Double.parseDouble(reader.readLine());
			for (Player i : pb.findPlayer(playerList, pr)) {
				System.out.println(i);
			}

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choise);
		}
	}
}
