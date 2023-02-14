package task3;
import java.util.*;

public class task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> teamList14 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		for(int i = 0; i<5; i++) {
			String teamName = sc.nextLine();
			teamList14.add(teamName);
		}
		ArrayList <String> teamList15 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		for(int i = 0; i<5; i++) {
			String teamName = sc.nextLine();
			teamList15.add(teamName);
		}
		teamList14.retainAll(teamList15);
		System.out.println("Consistent Scorer:");
		System.out.println(teamList14);
	}
}
