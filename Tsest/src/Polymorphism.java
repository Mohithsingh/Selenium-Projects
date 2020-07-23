//Ability of object to have different forms
//polymorphism means different forms
//class and its properties to have different forms
public class Polymorphism {
	public static void main(String[] args) {
		//upcasting--base class gets to use its subclass
		Bank b1=new Bank_ABC();//Reference of bank class pointing to bank abc class
		Bank b2=new Bank_DEF();
		Bank b3=new Bank_XYZ();
		System.out.println(b1.getinterestrate());
		System.out.println(b2.getinterestrate());
		System.out.println(b3.getinterestrate());
	}

}
