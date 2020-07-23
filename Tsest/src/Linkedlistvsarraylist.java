import java.util.ArrayList;
import java.util.LinkedList;

//linked list insertion is faster compared to arraylist
//Linked list uses pointer at the start and end.
//arraylist operation is pretty fast compared to the linkedlist search operation.
//Linkedlist does not provide random or index based access and you need to iterate linked list to retrieve any elemnet.
//Linkedlist element deletion is faster compared to arraylist
//Linkedlist has more memory overhead the arraylist becuase in Arraylist each index only holds actual objectbut in case of linkedlist each node holds both data and address of next and previous node.

public class Linkedlistvsarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Long n=(long) 1E7;
ArrayList arraylist=new ArrayList();
long millis=System.currentTimeMillis();
for(int i=0;i<n;i++) {
	arraylist.add(i);
}
System.out.println("Insertion arraylist takes "+(System.currentTimeMillis()-millis)+"ms");
LinkedList linkedlist=new LinkedList();
millis=System.currentTimeMillis();
for(int i=0;i<n;i++) {
	linkedlist.add(i);
}
System.out.println("Insertion linkedlist takes "+(System.currentTimeMillis()-millis)+"ms");

millis=System.currentTimeMillis();	
arraylist.remove(1E5);
System.out.println("del front arraylist takes "+(System.currentTimeMillis()-millis)+"ms");

millis=System.currentTimeMillis();	
linkedlist.remove(1E5);
System.out.println("del front linkedlist takes "+(System.currentTimeMillis()-millis)+"ms");

millis=System.currentTimeMillis();	
arraylist.get((int) ((long)n/2));
System.out.println("get front arraylist takes "+(System.currentTimeMillis()-millis)+"ms");


millis=System.currentTimeMillis();	
linkedlist.get((int) ((long)n/2));
System.out.println("get front linkedlist takes "+(System.currentTimeMillis()-millis)+"ms");

}
}


