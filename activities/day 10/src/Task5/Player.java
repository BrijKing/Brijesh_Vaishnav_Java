package Task5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Player {
	private String name;
	private Date dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;

	public Player() {

	}

	public Player(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {

		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}

	public static Player createPlayer(String detail) throws NumberFormatException, ParseException {
		String[] details = detail.split(",");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return new Player(details[0], format.parse(details[1]), details[2], Integer.parseInt(details[3]),
				Integer.parseInt(details[4]), Integer.parseInt(details[5]), details[6], Double.parseDouble(details[7]));
	}

	@Override
	public String toString() {
		return name + " " + dateOfBirth + " " + skill + " " + numberOfMatches + " " + runs + " " + wickets + " "
				+ nationality + " " + powerRating;
	}

	public static String highestCount(List<Player> list) {
		Map<String, Integer> contryMap = new TreeMap<>();
		for (Player i : list) {
			contryMap.put(i.getNationality(), 0);
		}
		int count = 0;
		for (Player i : list) {
			if (contryMap.containsKey(i.getNationality())) {
				count = contryMap.get(i.getNationality());
				contryMap.replace(i.getNationality(), count + 1);
			}
		}
		;
		ArrayList<String> contry = new ArrayList<>();
		ArrayList<Integer> countContry = new ArrayList<>();
		

		contryMap.entrySet().forEach(entry -> {
			contry.add(entry.getKey());
			countContry.add(entry.getValue());
	
		});
        int max = 0;
	    for(int i: countContry) {
	    	if(i > max) {
	    		max = i;
	    	}
	    }
	    
	    int indexOfMax = countContry.indexOf(max);
	    
	    return contry.get(indexOfMax);

	}

}
