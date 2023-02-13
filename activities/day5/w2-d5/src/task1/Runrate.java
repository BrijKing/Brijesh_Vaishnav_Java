package task1;
import java.util.*;

public class Runrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value:");
		
		
		try {
			int totalRun = s.nextInt();
			int totalOvers = s.nextInt();
			int runRate = 0;
			runRate = totalRun/totalOvers;
			System.out.println(runRate);
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
		

	}

	

}
