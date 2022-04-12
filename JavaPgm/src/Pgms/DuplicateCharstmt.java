package Pgms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "My Branch is Computer Science";
		Set<Character> duplicateChars=new HashSet<Character>();
		for(int i=0;i<s.length()-1;i++) {
			char c = s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(c==s.charAt(j)) {
					duplicateChars.add(c);
					break;
					
				}
			}
		}
		for(char s1:duplicateChars) {
			System.out.print(s1);
			
		}

	}

}
