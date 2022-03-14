package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}

}
*/
	//ctrl+shift+o
	//ctrl+shift+/
	
	@Test
	public void testCase1()
	{                         

		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(500,200+300);
		
	}
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		int r=c.add(300,200);
		Assertions.assertEquals(500, r);
	}
	@Test
	void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	

	@Test
	void testAssertNull() {
	String str1 = null;
	String str2 = "abc";
	Assertions.assertNull(str1);// str 1 is null - condition is ok test case ok
	Assertions.assertNotNull(str2); // str2 - notnull ? - condtion is ok - test case ok
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}


}