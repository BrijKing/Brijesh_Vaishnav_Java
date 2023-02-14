

import java.time.*;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Dateandtime {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Please enter time :"); 
		String time1=new Scanner(System.in).nextLine();
		String time2=new Scanner(System.in).nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		difference=difference/(1000*60*60);
		if((int)difference>24)
		{
			System.out.println("You can't have more than 24 hours: ");
			return;
         } // System.out.println(difference/(1000*60*60));        
		System.out.println("your bill is "+difference*25+" rupees");
		
	
	}
}