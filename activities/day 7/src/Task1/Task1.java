package Task1;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		TreeSet<String> playerName = new TreeSet<String>();
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			playerName.add(sc.next());
		}
		
		for(String i: playerName) {
			System.out.println(i);
		}
		
	}

}
