package assertClassDemo;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

public class AssertExample1 {
	
	String str="This assert class is working fine";
	@Test
public 	void test() {
       assertEquals("This assert class is working fine",str);
       
       System.out.println("Hello");
       
   
		
	}

}

