
public class Lengthofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="the main man";
System.out.println(word.length());
char[] chararray=word.toCharArray();
int length=0;
for(char c:chararray) {//taking character array and storing it in c
	length++;
	}
	System.out.println(length);
	}
}
