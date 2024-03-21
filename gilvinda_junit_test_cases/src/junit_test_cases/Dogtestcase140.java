package junit_test_cases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Dogtestcase140 {

	static dog_testcase140 d1;
	String name;
	String breed;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		d1= new dog_testcase140("sammy","labrador");
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
	public void testname() {
		name=d1.getName();
		assertEquals("sammy",name);	
		
	}
	@Test
	public void testbreed() {
		breed=d1.getBreed();
		assertEquals("labrador",breed);	
	

}
}