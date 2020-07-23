import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Findsmallestnumber {
	Integer array[]= {5,2,0,4,1};
	public void findsmallest() {
		int smallestnumber=Integer.MAX_VALUE;
	for(int i=0;i<array.length;i++) {
		if(array[i]<smallestnumber){
			smallestnumber=array[i];
		}
	}
	System.out.println("Thge smallest number is "+smallestnumber);	
	}
	//using arrays
	public void usingarrays() {
		Arrays.sort(array);
		System.out.println(array[0]);
	}
	//using collections
	public void usingcokections() {
		List<Integer> list=Arrays.asList(array);
		Collections.sort(list);
		int smallest=list.get(0);
		System.out.println(smallest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findsmallestnumber fsn=new Findsmallestnumber();
		fsn.findsmallest();
		fsn.usingarrays();
		fsn.usingcokections();
	}

}
