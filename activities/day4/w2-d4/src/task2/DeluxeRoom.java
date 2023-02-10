package task2;

public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public DeluxeRoom() {

	}

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}

	public int getRatePerSqFeet() {
		if (this.hasWifi)
			this.ratePerSqFeet += 2;
		return this.ratePerSqFeet;
	}

}
