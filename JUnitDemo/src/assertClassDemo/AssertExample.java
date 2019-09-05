package assertClassDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class AssertExample {
	
	int num;
	String temp,str;
	

	@BeforeEach
	public void setUp()  {
		num=5;
		str=("This assert class is working fine");
		temp=null;
		
	}



	@Test
public 	void test() {
        assertEquals("This assert class is working fine",str);
		
		assertFalse(num>6);
		
		assertNotNull(str);
		
		assertNull(temp);
		
		assertTrue(num==5);
	}

}
