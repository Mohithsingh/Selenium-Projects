import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"performance"})
	public void feature1() {
		System.out.println("Inside Feature1");
	}
	@Test(groups= {"regression"})
	public void feature2() {
		System.out.println("Inside Feature2");
	}
	@Test(groups= {"performance","regression"})
	public void feature3() {
		System.out.println("Inside Feature3");
	}

}
