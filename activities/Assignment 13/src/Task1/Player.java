package Task1;

public class Player {
	int playerId;
	String name;
	String country;
	String skill;

	public Player() {
		super();
	}

	public Player(int playerId, String name, String country, String skill) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", country=" + country + ", skill=" + skill + "]";
	}
}
