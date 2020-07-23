
public class Staticdeep {
	int age;
	int id;
	String name;
	static int noofstudents=0;
	Staticdeep(){
		noofstudents++;
	}
	public static int getnoofstudents() {
		return noofstudents;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
