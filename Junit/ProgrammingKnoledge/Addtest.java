package ProgrammingKnoledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addtest {

	@Test
	public void addtest() {
		Myjunitclass ju=new Myjunitclass();
		int result=ju.add(100,200);
		assertEquals(300,result);
	}

}
