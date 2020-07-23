import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("enter the obtained marks:");
int score=sc.nextInt();
sc.close();
//byte,short,int,or char
switch(score)
{
case 60:
	case 50:
	System.out.println("Good");
	break;
case 40:
	System.out.println("Not Bad");
	break;
case 90:
	System.out.println("Very Good");
	break;
	default:
		System.out.println("The grade is not defined");
}
	}

}
