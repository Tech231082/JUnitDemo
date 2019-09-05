package testCaseClassDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import java.lang.*;
class testcasemethods extends TestCase {

	@Test
	public void test() {
		
				System.out.println("Number of test cases="+this.countTestCases());
				
				String name=this.getName();
				System.out.println("Test case name=" +name);
				
			}
	
	@Test
	public void test1() {
		
				System.out.println("Number of test cases="+this.countTestCases());
				
				String name=this.getName();
				System.out.println("Test case name=" +name);
			}
	@Test
	public void test2() {
		
				System.out.println("Number of test cases="+this.countTestCases());
				
				String name=this.getName();
				System.out.println("Test case name=" +name);
			}

}
