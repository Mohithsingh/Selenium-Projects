import org.testng.annotations.DataProvider;

public class Testdatafile {
	@DataProvider(name= "data")
	public Object[][] testData() {
		Object[][] obj=new Object[3][4];
		obj[0][0]="Mohith";
		obj[0][1]="M";
		obj[0][2]="mms@gmail.com";
		obj[0][3]="Manoj";
		obj[1][0]="Mohi";
		obj[1][1]="M";
		obj[1][2]="mm@gmail.com";
		obj[1][3]="Mano";
		obj[2][0]="Mo";
		obj[2][1]="M";
		obj[2][2]="m@gmail.com";
		obj[2][3]="Man";
		return obj;
		
		
	}
}
