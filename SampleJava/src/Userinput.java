import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some number");
		//to get number as input
		int user_input_number=sc.nextInt();
		System.out.println("The entered value is:");
		//print output without breaking line
		System.out.print(user_input_number);
		sc.close();
		Scanner sc1=new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter some decimal value");
		//to get number as input
		sc1.close();
		double user_input_db=sc1.nextDouble();
		System.out.println("The entered value is:");
		//print output without breaking line
		System.out.print(user_input_db);
		Scanner sc2=new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter some string value");
		//to get number as input
		java.lang.String user_input_st=sc2.nextLine();
		System.out.println("The entered string is:");
		//print output without breaking line
		System.out.print(user_input_st);
		sc2.close();
	}

}
