import java.util.*;
public class task1 {
	public static void main(String[] args) {
		System.out.print("Enter a salary: ");
		Scanner s=new Scanner(System.in);
		int salary=s.nextInt();
		System.out.print("Enter a shift: ");
		int shift = s.nextInt();
		if(salary > 8000) {
			System.out.print("Salary too large");
			}
		else if(shift < 0) {
			System.out.print("Shift too small");
			}
		else if(salary < 0) {
				System.out.print("Salary too small");
			}
		else {
			float remaining = (float) (salary/2 + (shift*(salary * 0.02)));
			System.out.print(remaining);
		}
	}
}
