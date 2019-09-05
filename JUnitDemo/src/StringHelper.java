import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringHelper {

	@Test
	public String test1() {
		StringHelper help=new StringHelper();
		String expout="RTAA";
		String actout=help.test1();
		
		assertEquals(actout,expout);
		return actout;
	
	}

}
