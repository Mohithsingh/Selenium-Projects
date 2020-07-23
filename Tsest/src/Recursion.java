//can call method from itself
public class Recursion {
	///N!=Nx(N-1)x.....x2x1
	///5!=5x4x3x2x1
	//calling factorial inside factorial metod is called recursion
public static int factorial (int N) {
if(N<=1)
	return 1;
else return(N* factorial(N-1));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(4));
	}

}
