package reddit;

interface Animal{
	public void weight();
	public void type();
}

class Whale implements Animal{
	public void weight() {
		System.out.println("<200 tons");
	}

	
	public void type() {
		System.out.println("Mammal");
		
	}
}

public class inter{
	public static void main(String[] args) {
		Whale w = new Whale();
		w.weight();
		w.type();
	}
}