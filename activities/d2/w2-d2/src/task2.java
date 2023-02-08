import java.util.*;
public class task2{
	public static void main(String[] args) {
		System.out.print("Enter a value:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = 0;
		if(n<0) {
			System.out.print("Number is too small");
		}
		else if(n > 32767) {
			System.out.print("Number is too large");
		}
		else {
			while(n != 1) {
				if(n % 2 != 0) {
					temp = 1;
				}
				n = n /2;
			}
			
			if(temp == 1) {
				System.out.print("No");
			}
			else {
				System.out.print("Yes");
			}
			
		}
	}
}