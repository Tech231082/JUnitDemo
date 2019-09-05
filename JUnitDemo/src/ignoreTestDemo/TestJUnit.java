package ignoreTestDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJUnit {

String message="Rahini";
MessageUtil msg=new MessageUtil(message);

	@Test
	public void testprintMessage() {
		System.out.println("Inside print message");
		message="Rahini";
		assertEquals(message,msg.printMessage());
	
		
	}
	@Ignore
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside Salutation message");
		message="Rahini";
		assertEquals(message,msg.SalutationMessage());
	
		
	}

}
