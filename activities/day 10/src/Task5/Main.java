package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players:");
		int n = Integer.parseInt(reader.readLine());
		ArrayList<Player> playerDetails = new ArrayList<>();
		for(int i = 0; i<n ; i++) {
			playerDetails.add(new Player().createPlayer(reader.readLine()));
			
		}
		
		System.out.println("The nationality with maximum players:"+new Player().highestCount(playerDetails));
		

	}

}
