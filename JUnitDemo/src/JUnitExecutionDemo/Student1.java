package JUnitExecutionDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Student1 {
	int roll_no;
	String name;
	float percentage;
	String grade;
	public Student1(int rn,String nm,float p) {
		this.roll_no=rn;
		name=nm;
		percentage=p;
	}

	public String Calgrade() {
		if(percentage<35) {
			grade="fail";
		}
		else if(percentage<50){
			grade="pass";
		}else if(percentage<60) {
			grade="second grade";
		}else if(percentage<70) {
			grade="first";
		}else {
			grade="distinction";
		}
		return grade;
	
}
	
	public void Display() {
		System.out.println("Roll number"+roll_no);
		System.out.println("Name"+name);
		System.out.println("percentage"+percentage);
		System.out.println("Grade"+grade);
	}
}
