package Day4;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		Person p1 =new Person();
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter Person Details: Name, age and city" );
		name = sc.nextLine();
		age = sc.nextInt();
		city = sc.nextLine();
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		System.out.println("Enter Person Details : Name Age And City");
		name = sc.nextLine();
		age = sc.nextInt();
		city = sc.next();
		p1 = new Person(name, age, city); 
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();
		
	}

}
