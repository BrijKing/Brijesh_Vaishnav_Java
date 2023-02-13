package task2;
import java.util.*;
public class task2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of overs:");
			int overs = s.nextInt();
			
			int[] runs = new int[overs];
			
			System.out.println("Enter the number of run for each over");
			
			for(int i = 0; i <overs; i++) {
				runs[i] = s.nextInt();
			}
			System.out.println("Enter the over number");
			
			int over = s.nextInt();
			
			System.out.println("Runs scored in this over:"+ runs[over]);
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
	
}
