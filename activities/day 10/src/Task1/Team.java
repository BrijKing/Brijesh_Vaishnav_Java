package Task1;

import java.util.*;

public class Team {
	private String name;
	private List<Player> playerList = new ArrayList<Player>();

	public Team() {

	}

	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public void addPlayerToTeam(Player player) {
		playerList.add(player);
		System.out.println("Player successfully added");
	}

	public Boolean removePlayerFromTeam(String name) {
		for(Player i: playerList) {
			if(i.getName().equals(name)) {
			 int index = playerList.indexOf(i);
			 playerList.remove(index);
			 System.out.println("Playe removed succesfully");
			 return true;
			}
			else {
				System.out.println("Player not found.");
			}
		}
		return false;
	
		
	}

	public void displayPlayers() {
		if (playerList.isEmpty()) {
			System.out.println("No player to show");
		} else {
			System.out.println("Player in : " + name);
			for (Object i : playerList) {
				System.out.println(i);
			}

		}
	}

}
