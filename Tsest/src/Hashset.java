import java.util.HashSet;
import java.util.Iterator;
//difference between hashset and list
//list can contain duplicated
//set can only contain unique elements cannot contain duplicates
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hashset=new HashSet<String>();
hashset.add("mohit");
hashset.add("arun");
hashset.add("padma");
Iterator<String> itrs=hashset.iterator();
while(itrs.hasNext());
System.out.println(itrs.next());
	}

}
