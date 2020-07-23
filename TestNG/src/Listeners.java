import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter  {

	public void OnTestSuccess(ITestResult tr) {
		System.out.println("Testcase Pass");
	}
	public void OnTestFailure(ITestResult tr) {
		System.out.println("Testcase Fail");
	}
}

