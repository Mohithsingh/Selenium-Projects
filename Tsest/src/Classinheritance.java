
public class Classinheritance {

	public static void main(String[] args) {
		// Classess in java can be extended
		//creating new classes which retain
		//characteristics of base class
	Rectangle rec=new Rectangle();
	Triangle tri=new Triangle();
	rec.set_values(8, 9);
	tri.set_values(10, 10);
	System.out.println("Area of rectangle ="+rec.area());
	System.out.println("Area of triangle ="+tri.area());
	
	}
	

}
