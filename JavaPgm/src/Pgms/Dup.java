package Pgms;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String str = "abbsdfase";
		String s="";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(s.indexOf(c)==-1) {
				s=s+c;
			}
		}
		s=s.trim();
		System.out.println(s);


	}

}
