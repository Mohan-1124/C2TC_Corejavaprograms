package DayTwo;
import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args) {
		int x,y;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter value:");
		x = sc.nextInt();
		System.out.println("Enter Value:");
		y = sc.nextInt();
		
		if(x % y == 0)
			System.out.println(x % y + "is a multiple");
		else
			System.out.println(x % y + "is not a multiple");
		

	}

}
