package task1;
import java.util.*;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList playerDetail = new ArrayList();
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		String name = sc.nextLine();
		playerDetail.add(name);
		System.out.println("Enter age");
		int age = sc.nextInt();
		playerDetail.add(age);
		System.out.println("Enter contry");
		String contry = sc.nextLine();
		playerDetail.add(contry);
		for(int i = 0; i<playerDetail.size(); i++) {
			System.out.println(playerDetail.get(i));
		}
		
		System.out.println("Enter Skill");
		String skill = sc.nextLine();
		System.out.println("Enter the position of the detail to be removed");
		int index = sc.nextInt();
		playerDetail.set(index, skill);
		for(int i = 0; i<playerDetail.size(); i++) {
			System.out.println(playerDetail.get(i));
		}
		
		

	}

}
