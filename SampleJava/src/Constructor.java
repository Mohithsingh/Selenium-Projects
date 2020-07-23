
public class Constructor {
	int length;
	int height;
	int breadth;
	public int getcubvolume() {
		return (length*breadth*height);
	}
	//Default constructor
	//define multiple constructor
Constructor(){
	System.out.println("We are in constructor");
	length=10;
	breadth=20;
	height=30;
}
Constructor(int l,int b,int h){
	length=l;
	breadth=b;
	height=h;
}
}
