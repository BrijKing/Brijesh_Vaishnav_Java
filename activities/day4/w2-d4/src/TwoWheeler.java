public class TwoWheeler extends Vehicle {
	
	private boolean KickStartAvailable;
	public TwoWheeler()
	{
		
	}
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean KickStartAvailable)
	{
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.KickStartAvailable = KickStartAvailable;
	}
	
	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		if(this.KickStartAvailable) {
			System.out.println("Kick Start Available:YES");
		}
		else {
			System.out.println("Kick Start Available:NO");
		}
	}
	
}

