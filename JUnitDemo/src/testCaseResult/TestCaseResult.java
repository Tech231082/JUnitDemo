package testCaseResult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import java.lang.*;


	 public class TestCaseResult extends TestResult {

		
		public synchronized void addError(Test test,Throwable t) {
			super.addError((junit.framework.Test) test,t);
		}
		public synchronized void addFailure(Test test,AssertionFailedError t) {
			super.addFailure((junit.framework.Test) test,t);
		}

		@Test
		public void testAdd() {
			Assert.assertEquals(6,6);
		}
		@Override
		public synchronized void stop() {
				
	}

}
