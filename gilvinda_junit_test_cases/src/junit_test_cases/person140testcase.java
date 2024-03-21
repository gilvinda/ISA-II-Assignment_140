package junit_test_cases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class person140testcase {
	
	static person_140testcase p1 ;
	String name;
	int age;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 p1 = new person_140testcase("jerry",20);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testName() {
		name=p1.getName();
     	assertEquals("jerry",name);	
	}
	@Test
	public void testAge() {
		age=p1.getAge();
		assertEquals(20,age);

}
}
