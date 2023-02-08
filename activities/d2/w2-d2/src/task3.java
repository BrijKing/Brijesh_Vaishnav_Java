import java.util.*;
public class task3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value:");
		int x;
		int sum = 0;
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.print("Invalid Input");
		}
		else if(n > 32767) {
			System.out.print("Invalid Input");
		}
		else {
			while(n != 0) {
				x = n % 10;
				if (x % 2  != 0) {
					sum = sum + x;
				}
				n = n /10;
			}
			System.out.print(sum);
		}
	
	}
}
