package task2;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");

		int type = s.nextInt();

		System.out.println("Hotel Name:");

		String name = s.next();

		System.out.println("Room SqureFeet Area:");

		int sqFeetArea = s.nextInt();

		System.out.println("Room has TV (yes/no):");

		boolean hasTV = s.next().equals("yes") ? true : false;

		System.out.println("Room has wifi (yes/no):");

		boolean hasWifi = s.next().equals("yes") ? true : false;
		
		System.out.println("Room tariff per day: ");
		double terrif=0;
		
		switch(type)
		{
			case 1: //delux
				DeluxeRoom deluxRoom=new DeluxeRoom(name,sqFeetArea, hasTV, hasWifi);
				terrif=deluxRoom.calculateTariff( deluxRoom.getRatePerSqFeet());
				break;
			case 2://deluxAc
				DeluxAcRoom deluxACRoom=new DeluxAcRoom(name,sqFeetArea, hasTV, hasWifi);
				terrif=deluxACRoom.calculateTariff( deluxACRoom.getRatePerSqFeet());
			    break;
			case 3: //suitAc
				SuiteACRoom suitAcRoom=new SuiteACRoom(name,sqFeetArea, hasTV, hasWifi);
				terrif=suitAcRoom.calculateTariff( suitAcRoom.getRatePerSqFeet());
				 break;
		}
		
		System.out.println(terrif);

	}

}
