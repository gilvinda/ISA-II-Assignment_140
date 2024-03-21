package junit_test_cases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addnos140test {

	@Test
	public void addtest1() {
	   add_nos140 obj1=new add_nos140();
	   int result=obj1.add(20, 10);
	   assertEquals(30,result);
	}
	
	@Test
	public void addtest2() {
        add_nos140 obj2=new add_nos140();
        int result=obj2.add(5, 10);
        assertEquals(15,result);
    }

}
