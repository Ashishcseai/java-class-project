package classroom;

class Student{
	private String name;
	private int roll;
	private int marks;
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public int getmarks() {
		return marks;
	}
	
	public void setmarks(int marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid marks");
		}
		
	}
	
	void display() {
		System.out.println("name" +name+ "roll no" +roll+ "marks" +marks);
	}
}

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


public class encap {
	public static void main(String[] args) {
		Student s1 = new Student("dhruv", 100);
		
		s1.getmarks();
		s1.setmarks(87);
		
		s1.display();
		//s1.name = "dhruv";
		s1.display();
		
		C b = new C();
		System.out.println(b.name);
		b.show();
		b.display();
		
		
		b.add();
		
		
		
	}
}