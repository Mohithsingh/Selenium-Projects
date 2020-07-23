package Sample;

import java.util.Scanner;

public class Javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("C value"+c);
		
		Scanner sc=new java.util.Scanner(System.in);
		try {
		System.out.println("Enter the mark:");
		int mark=sc.nextInt();
		if(mark>100) {
	System.out.println("You are Pass");
		}else
			System.out.println("You are fail");
		}finally {
	sc.close();
		}
	}

}
