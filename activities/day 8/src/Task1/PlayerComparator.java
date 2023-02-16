package Task1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	
	@Override
	public int compare(Player player1, Player player2) {
		
		return player1.getSkill().compareTo(player2.getSkill());
	}

}
