package Junit.elf.devops_Junit;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)  //By using this it will get executed in order
@DisplayName("Execute Class")
public class TextMessage {
	
	private String actual;
	private String expected;
	private Mesaage message;
	
	
	
	
	@RepeatedTest(value =5,name="-->{currentRepetition}/{totalRepetitions}") //It runs multiple times
	public void repeatedTest() {
		System.out.println("Repeated Test()!");
	}
	
	
	@BeforeAll
	public static void startUp() {
		System.out.println("->startUp()!");
	}
	@AfterAll
	public static void cleanUp() {
		System.out.println("->cleanUp()!");
	}
	@BeforeEach  //This method will be executed after each method
	public void setUpBeforeEachTestMethod() {
		message=new Mesaage();
		actual=message.getMessage();
		expected="This is the expected Message()!";

		System.out.println("->setUpBeforeEachTestMethod()!");
		
	}
	@AfterEach
	public void cleanUpAfterEachMethod() {
		message=null;
		actual=null;
		expected =null;
		System.out.println("->cleanUpAfterEachTestMethod()!");
	}
	@Test
	@DisplayName("Get Message")
	@Order(33) //can give any number but it will be random
	@Disabled   //Particular testcase won't run
	public void testGetMessage() {
		Assertions.assertEquals(expected, actual);
		System.out.println("testGetMessage!");
	}

	@Test
	@DisplayName("Update Message")
	@Order(1)
	public void testUpdateMessage() {
		 	System.out.println("testUpdateMessage");
	}

	@Test
	@DisplayName("Delete Message")
	@Order(5)
	public void testDeleteMessage() {
		System.out.println("testDeleteMessage");
	}
}
