
public class Staticmethod {
	//what does 'ststic' keyword do in a class

	public static void main(String[] args) {
		// static belongs to the class instead of a specific instance
		Staticlass cs=new Staticlass();
		Staticlass.dosomething("Hello");
		System.out.println(Staticlass.dosomething("Hello"));
		//non static belongs to the instance rather than the class
		Staticlass cs1=new Staticlass();
		cs1.dosomethingelse("World");
		System.out.println(cs1.dosomethingelse("World"));
		
	}

}


