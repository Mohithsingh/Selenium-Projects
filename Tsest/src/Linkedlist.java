import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("mohith");
		name.add("geetha");
		name.addFirst("New Family");
		name.addLast("Enjoy");
		//name.removeFirst();
		//name.removeLast();
		//name.clear();
		//name.remove(1);
		//name.set(2, "Geetha");
		System.out.println(name.size());
		for (String n:name)
			System.out.println(n);

	}

}
