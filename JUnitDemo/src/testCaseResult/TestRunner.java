package testCaseResult;

import org.junit.runner.JUnitCore;
import java.lang.*;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public  class TestRunner {

	public static void main(String[] args) {

		Result result=JUnitCore.runClasses(TestCaseResult.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
System.out.println(result.wasSuccessful());

	}

}
