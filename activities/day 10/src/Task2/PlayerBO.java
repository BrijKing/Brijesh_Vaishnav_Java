package Task2;
import java.util.*;

public class PlayerBO {
	public List<Player> findPlayer (List<Player> playerList, String nationality){
		List<Player> returnList = new ArrayList<Player>();
		for(Player i: playerList) {
			if(i.getNationality().equals(nationality)) {
				returnList.add(playerList.get(playerList.indexOf(i)));
			}
		}
		
		return returnList;
	}
	
	public List<Player> findPlayer(List<Player> playerList, Date dateOfBirth){
		List<Player> returnList = new ArrayList<Player>();
		for(Player i: playerList) {
			if(i.getDateOfBirth().equals(dateOfBirth)) {
				returnList.add(playerList.get(playerList.indexOf(i)));
			}
		}
		
		return returnList;
		
	}
	
	public List<Player> findPlayer(List<Player> playerList, Double powerRating){
		List<Player> returnList = new ArrayList<Player>();
		for(Player i: playerList) {
			if(i.getPowerRating() == powerRating) {
				returnList.add(playerList.get(playerList.indexOf(i)));
			}
		}
		
		return returnList;
		
	}
}
