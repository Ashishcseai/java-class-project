package pTwo;
/*
import pOne.access;

public class control extends access{
	public static void main(String[] args) {
	}
}
*/

/*
class Parent{
	public int age  = 50;
	protected String name = "Dhruv";
	
	private String secret = "xyz";
	
	public void display() {
		System.out.println("Parent display");
	}
	private void hidden() {
		System.out.println("Parent hidden method");
	}
	public static void staticMethod() {
		System.out.println("Static method of parennt");
	}
	final void finalMethod() {
		System.out.println("Final method of parent");
	}
}


class Child extends Parent {
	public void show() {
		System.out.println("Name: " + name);
		//System.out.println("Secret: "+secret);
	}
	@Override
	public void display() {
		System.out.println("child display");
	}
	
}
*/

class Parent{
	String name = "Dhruv";
	Parent(){
		System.out.println("Parent class constructor");
	}
	void display() {
		System.out.println("display method");
	}
}

class Child extends Parent{
	 String name =  "dh";
	 void play() {
		 System.out.println(this.name);
		 System.out.println(super.name);
		 super.display();
	 }
	 Child(){
		 super();
	 }
}
public class control{
	public static void main(String[] args) {
		Child c = new Child();
		
		c.play();
		
 	}
}