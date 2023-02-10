import java.util.*;
public class VehicleMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int vehicleType = s.nextInt();
		System.out.println("Vehicle Make:");
		String vehicleMake = s.next();
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = s.next();
		System.out.println("Enter Fuel Type:");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int fuelTypeN = s.nextInt();
		String fuelType = null;
		if(fuelTypeN == 1) {
			fuelType = "Petrol";
		}
		else if(fuelTypeN == 2) {
			fuelType = "Diesel";
		}
		System.out.println("Fuel Capacity:");
		int fuelCapacity = s.nextInt();
		
		System.out.println("Engine CC:");
		int CC = s.nextInt();
		
//		Vehicle v = new Vehicle(vehicleMake,vehicleNumber, fuelType, fuelCapacity, CC);
		
//		v.displayMake();
//	    v.displayBAsicInfo();
	    
	    if(vehicleType == 1) {
	    	System.out.println("IS Kick Start Availabe:");
	    	boolean isKickstart = s.next().equals("yes") ? true : false;
	    	TwoWheeler tw =  new TwoWheeler(vehicleMake, vehicleNumber, fuelType, fuelCapacity, CC, isKickstart);
	    	tw.displayMake();
	    	tw.displayBAsicInfo();
	    	tw.displayDetailInfo();
	    	return;
	    }
	    
	    System.out.println("Audio System:");
    	String AudioSystem = s.next();
    	
    	System.out.println("Number of Doors:");
    	int Doors = s.nextInt();
    	FourWheeler fw =  new FourWheeler(vehicleMake, vehicleNumber, fuelType, fuelCapacity, CC, AudioSystem, Doors);
    	fw.displayMake();
    	fw.displayBAsicInfo();
    	fw.displayDetailInfo();
	    
	    
	    
	    
	}
}
