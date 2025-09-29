package hello;

/*
public class FirstTry {
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
*/

class Student{
	String name;
	int roll;
	Student(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	Student(Student s){
		name = s.name;
		roll = s.roll;
	}
	void display() {
		System.out.println(name + " " + roll);
	}
}

class Machine{
	String motor;
	int hp;
	int consumption;
	float efficiency;
	Machine(String motorName, int hp, int consumption, float efficiency){
		this.motor = motorName;
		this.hp = hp;
		this.consumption = consumption;
		this.efficiency = efficiency;
	}
	/*
	Machine(Machine m){
		this.motor = m.motor;
		hp = m.hp;
		consumption = m.consumption;
		efficiency = m.efficiency;
		
	}
	*/
	int kwh() {
		return hp*732;
	}
	int kwh(int mul) {
		return hp*mul;
	}
	
}

class Today{
	String name;
	int roll;
	
	Today(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	void display() {
		System.out.println(name);
	}
}

public class FirstTry{
	public static void main(String[] args) {
		Student s1 = new Student("dhruv",1);
		Student s2 = new Student("krishna", 2);
		s1.display();
		s2.display();
		
		Machine m1 = new Machine("car",2,32,10);
		
		System.out.println(m1.motor);
		
		System.out.println(m1.kwh());
		System.out.println(m1.kwh(1000));
		
		Today t1 = new Today("sefes",99);
		t1.display();
		t1.name = "dfdf";
		t1.display();
		
		
	}
}