package JUnitExecutionDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitTestDemo {
	
	Student S1,S2,S3,S4;



	@BeforeEach
	void setUp()  {
		System.out.println("In Before Method");
		S1=new Student(1,"Aman",35);
		S2=new Student(2,"Rishi",50);
		S3=new Student(3,"Karan",60);
		S4=new Student(4,"Priya",70);
	}

	
	@Test
	void testPass() {
		S1.Calgrade();
		assertEquals("Pass class",S1.grade);
		S1.Display();
	}

	@Test
	void testSecond() {
		S2.Calgrade();
		assertEquals("Second class",S2.grade);
		S2.Display();
	}

	@Test
	void testFirst() {
		S3.Calgrade();
		assertEquals("First class",S3.grade);
		S3.Display();
	}

	@Test
	void testDist() {
		S4.Calgrade();
		assertEquals("Distinction class",S4.grade);
		S4.Display();
	}

}
