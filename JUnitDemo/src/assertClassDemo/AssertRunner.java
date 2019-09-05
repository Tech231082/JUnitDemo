package assertClassDemo;

import  org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;

public class AssertRunner {

	public static void main(String[] args) {
		
		Result result=JUnitCore.runClasses(AssertExample.class);
		
		for (Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		

	}

}
