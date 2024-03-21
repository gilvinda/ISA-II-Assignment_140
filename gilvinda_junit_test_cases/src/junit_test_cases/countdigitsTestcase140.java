package junit_test_cases;

import static org.junit.Assert.*;

import org.junit.Test;

public class countdigitsTestcase140 {

	@Test
	public void countdigits_testcase1() {
		
		int num = 12345;
        count_digits_nos140 obj3 = new count_digits_nos140();
        int result = obj3.count_digits(num);
        assertEquals(5,result);
   
	}
	@Test
	public void countdigits_testcase2() {
		
		int num = 12345678;
        count_digits_nos140 obj4 = new count_digits_nos140();
        int result = obj4.count_digits(num);
        assertEquals(8,result);
	}

}

