
 abstract public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle()
	{
		
	}
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {

		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayMake() {
		System.out.println("***"+this.make+"***");
	}
	
    public void displayBAsicInfo() {
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:"+ this.vehicleNumber);
		System.out.println("Fuel Capacity:"+ this.fuelCapacity);
		System.out.println("Fuel Type:"+this.fuelType);
		System.out.println("CC:"+this.cc);
		
	}
    
    abstract public void displayDetailInfo();
	
	
	
}
