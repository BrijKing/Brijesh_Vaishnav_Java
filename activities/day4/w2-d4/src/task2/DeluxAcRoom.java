package task2;

public class DeluxAcRoom extends DeluxeRoom {
	protected int ratePerSqFeet;
	public DeluxAcRoom() {
		// TODO Auto-generated constructor stub
	}

	public DeluxAcRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}

}
