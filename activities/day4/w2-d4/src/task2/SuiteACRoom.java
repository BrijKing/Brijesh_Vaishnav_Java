package task2;

public class SuiteACRoom extends HotelRoom{
	protected int ratePerSqFeet;
	

	public SuiteACRoom() {
		
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
	public int getRatePerSqFeet() {
		if (this.hasWifi)
			this.ratePerSqFeet += 2;
		return this.ratePerSqFeet;
	}
	
	
	
	
}
