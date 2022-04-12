package Junit.elf.devops_Junit;

public class Palindrome {
	public boolean isPalindrome(String str) {
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			char c =str.charAt(i);
			result += c;
			
		}
		if(result.equals(str))
			return true;
		return false;
	}
	public static void main(String[] args) {
		String str="abab";
		Palindrome palindrome=new Palindrome();
		System.out.println("The result is:"+palindrome.isPalindrome(str));
	}

}
