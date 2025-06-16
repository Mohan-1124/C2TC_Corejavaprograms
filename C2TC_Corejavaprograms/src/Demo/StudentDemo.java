package Demo;

public class StudentDemo {
	public static void main(String args[]) {
		Student st = new Student();
		st.setId(101);
		st.setName("Aravind");
		st.setAge(20);
		System.out.println("ID:" +st.getId()+ " : " +"Age:" +st.getAge()+ " : " +"Name:"+ st.getName());;
	}
}