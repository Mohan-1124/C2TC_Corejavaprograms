package Day4;

public class Base {
	int varDefault = 10;
	public int varPublic= 20;
	private int varPrivate = 30;
	protected int varProtected = 24;
	
	void methodDefault() {
		System.out.println("Deafult Access Base code");
		System.out.println("Default Variable:" +varDefault);
	}
	public void methodPublic() {
		System.out.println("Public Access Code Base");
		System.out.println("Public Variable:" +varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private Access Base Code");
		System.out.println("Private Variable:" +varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access Base Class");
		System.out.println("Protected Variable:" +varProtected);
	}

}
