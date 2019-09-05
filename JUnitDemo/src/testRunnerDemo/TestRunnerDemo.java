package testRunnerDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testRunnerDemo.Test1;
import testRunnerDemo.Test2;

@RunWith(Suite.class)
@SuiteClasses({Test1.class,Test2.class})

class TestRunnerDemo {
	@Test
	void test() {
		System.out.println("Both tests are getting executed here");
		 
		
	}
	
	}


