package pOne;

class S1{
	protected String name = "dhruv";
	protected int roll = 100;
	
	void display() {
		System.out.println("Class Student");
	}
}

public class access{
	public static void main(String[] args) {
		System.out.println("Package pOne and calss main with a private class S1");
		S1 s = new S1();
		System.out.println(s.name);
		System.out.println(s.roll);
	}
	
}