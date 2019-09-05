import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class fixtureDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("code for beforeall method goes here");
		
	}

	@AfterAll
	static void tearDownAfterClass() {
		System.out.println("code for afterall method goes here");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("code for beforeeach method goes here");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("code for aftereach method goes here");
	}

	@Test
	void test1() {
		
		System.out.println("code for Test1 method goes here");
	}
	@Test
	void test2() {
		
		System.out.println("code for Test2 method goes here");
	}
	@Test
	void test3() {
		
		System.out.println("code for Test3 method goes here");
	}


}
