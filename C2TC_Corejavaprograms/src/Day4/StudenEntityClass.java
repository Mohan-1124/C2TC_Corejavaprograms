package Day4;

import Student.StudentEntityClass;

public class StudenEntityClass {
	private static StudentEntityClass obj = new StudentEntityClass();

	public static StudentEntityClass getObj()
	{
		return obj;
	}
	private int id;  
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentEntityClass [id=" + id + ", name=" + name + "]";
	}


}
