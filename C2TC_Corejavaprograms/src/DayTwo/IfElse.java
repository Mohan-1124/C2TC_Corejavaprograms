package DayTwo;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
int age;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		age = sc.nextInt();
		
		if (age>=18)  
			System.out.println("You Are Eligible For Voting");
			else
				System.out.println("You Are Not Eligible For Voting");
		

	}

}
