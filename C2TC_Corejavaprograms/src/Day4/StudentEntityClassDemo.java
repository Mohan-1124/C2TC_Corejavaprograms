package Day4;

import Student.StudentEntityClass;

public class StudentEntityClassDemo {

	public static void main(String[] args) {
		StudentEntityClass obj = StudentEntityClass.getObj();
		obj.setId(101);
		obj.setName("Aravind");
		System.out.println(obj);
	StudentEntityClass st1 = StudentEntityClass.getObj();
	    st1.setId(190);
	    st1.setName("Mani");
		System.out.println(st1);

	}

}
