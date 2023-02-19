package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players:");
		int n = Integer.parseInt(reader.readLine());
		List<Player> playerDetails = new ArrayList<Player>();
		for(int i = 0; i < n; i++) {
			playerDetails.add(new Player().createPlayer(reader.readLine()));
		}
		TreeMap<String, Integer> contyryDetails = new TreeMap<>();
		
		new Player().calculateNationalityCoutn(playerDetails).entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		});
		

	}

}
