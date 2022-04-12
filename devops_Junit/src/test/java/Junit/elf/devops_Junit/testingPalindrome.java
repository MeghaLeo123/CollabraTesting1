package Junit.elf.devops_Junit;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class testingPalindrome {
	private Palindrome palindrome;
	private String str;

	@BeforeEach
	public void setUpBeforeEachMethod() {
		str="abba";
		 palindrome=new Palindrome();
		
	}
	@Test
	@DisplayName("Testing palindrome ")
	public void testIsPalindrome() {
		Assertions.assertTrue(palindrome.isPalindrome(str));
		
	}
	@AfterEach
	public void cleanUpAfterEachMethod() {
		palindrome=null;
	}
	}


