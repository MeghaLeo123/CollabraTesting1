package Pgms;

public class SeperateDigits {

	public static void main(String[] args) {
	String s= "sgfsd35353jghgjk333";
	for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			System.out.print(s.charAt(i));
		}
	}

	}

}
