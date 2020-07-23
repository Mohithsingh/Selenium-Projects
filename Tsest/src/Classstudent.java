
public class Classstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentcheck mark=new Studentcheck();//mark called as object/instance
		mark.id=1;
		mark.setId(1);
		//mark.name="Mark";
		mark.age=15;
		mark.setAge=15;
		//System.out.println(mark.age+"is"+mark.id);
		System.out.println(mark.getAge()+"is"+mark.getId());
		
	}

}
