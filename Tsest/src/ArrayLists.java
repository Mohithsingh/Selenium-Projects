import java.util.ArrayList;
public class ArrayLists {
	public static void main(String[] args) {
		//int simplearray[]=new int[5];//hard to change size of array when it is fixed
		//java uses util library to create and use dynamic array list
		//Declare array in java
		//ArrayList-Keyword <datatype of array> name of array 
		//size can be increased/descreaaed in our favour
		ArrayList<Integer> mylist=new ArrayList<Integer>(5);
		mylist.add(1);
		mylist.add(3);
		mylist.add(5);
		mylist.add(7);
		mylist.add(9);
		
		//to access values we can use advanced for loop
		//iterate ain loop and print values
		for(Integer x:mylist)
			System.out.println(x);
		mylist.trimToSize();
		//size of array is the values stored in array (elemts contained)
		System.out.println(mylist.size());
	//mylist.remove(3);
		//System.out.println(mylist.size());
		//mylist.clear();
		//System.out.println(mylist.size());
		mylist.set(3, 100);
		System.out.println(mylist);
	}
	}

