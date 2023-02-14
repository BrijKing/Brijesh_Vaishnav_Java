package task2;
import java.util.*;

public class task2 {
	public static void main(String[] args) {
		ArrayList <String> teamList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			String teamName = sc.nextLine();
			teamList.add(teamName);
		}
		System.out.println("Enter swap position");
		int swapPostion = sc.nextInt();
		
		Collections.swap(teamList, 0, swapPostion);
		
		for(String i: teamList) {
			System.out.println(i);
		}
		
		
	}

}
