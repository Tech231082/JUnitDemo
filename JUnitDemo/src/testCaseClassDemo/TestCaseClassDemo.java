package testCaseClassDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestCaseClassDemo extends TestCase {


	@Test
  public void testcasedemo() {
		System.out.println("Number of test cases="+this.countTestCases());
		
		String name=this.getName();
		System.out.println("Test case name=" +name);
		
		this.setName("NewName");
		String newName=this.getName();
		System.out.println("New name of test is"+ newName);
	}
	

}
