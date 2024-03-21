package junit_test_cases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class fibonaccistestcase140 {

	fibonacci140 fb = new fibonacci140();
	fibonacci140 fs = new fibonacci140();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void test() {
		int[] expected= {0,1,1,2,3};
		assertArrayEquals(expected,fb.getFibSeries());
	}
	@Test
	public void test2() {
		int[] expected= {0,1,1,2,3};
		assertArrayEquals(expected,fs.getFibSeries());
	}

}
