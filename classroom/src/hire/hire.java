package hire;


class A{
	String name = "Dhruv";
	int roll = 1;
	
	void show() {
		System.out.println("Parent Class");
		
	}
}

class B extends A{
	void display() {
		System.out.println("child class");
	}
}

class C extends B{
	void add() {
		System.out.println("Calss C method");
	}
}


public class hire{
	public static void main(String[] args) {
		C obj = new C();
		obj.add();
	}
}