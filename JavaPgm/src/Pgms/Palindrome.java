package Pgms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=101;
		int rev=0,temp;
	 temp = num;
		while(num>0) {
			int num1=num%10;
			rev=rev*10+num1;
			num=num/10;
	
		}
		if(temp==rev) {
			System.out.println("The given number is palindrme");
			
		}else {
			System.out.println("The given number is not palindrome");
		}
	}

}
