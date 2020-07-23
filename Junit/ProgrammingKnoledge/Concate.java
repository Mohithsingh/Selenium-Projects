package ProgrammingKnoledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class Concate {

	@Test
	public void concattest() {
		Myjunitclass jn=new Myjunitclass();
		String results=jn.concat("Mohit", "King");
		assertEquals("MohitKing",results);
	}

}
