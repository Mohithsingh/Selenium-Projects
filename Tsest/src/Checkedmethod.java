public class Checkedmethod 
{
public static void main(String[] args) 
{
System.out.println(add(1,36));
System.out.println(add(5.45,36.77));
System.out.println(add("hello","world"));
	}
	public static int add(int a,int b) 
	{
		return(a+b);
	}
	public static double add(double a,double b) 
	{
		return(a+b);
	}
	public static java.lang.String add(java.lang.String a,java.lang.String b) 
	{
		return(a+b);
	}
}
