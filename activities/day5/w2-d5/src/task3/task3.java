package task3;
import java.util.*;
public class task3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the player name");
			String name = s.next();
			System.out.println("Enter the player age");
			int age = s.nextInt();
			if(age < 18) {
				throw(new CustomException("InvalidAgeRangeException"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
	}
}
