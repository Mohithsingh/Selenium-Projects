import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 4 Main list iterators*
public boolean hasNext();-->returns boolean,checks next value and access it
public Object next();
public boolean hasPrevious();-->checks previous value and access it
public Object previous();
 */
public class Listiterator {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Cricket");
		name.add("Badminton");
		name.add("Jogging");
		name.add("Home Workout");
		name.add("Coding");
		
		ListIterator<String> it=name.listIterator();
		while(it.hasNext())//check object present
			System.out.println(it.next());//reutns object itself
		
		System.out.println("");System.out.println("");
		
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		//Next-->starts from top
		//Previous-->Starts from last

	}

}
