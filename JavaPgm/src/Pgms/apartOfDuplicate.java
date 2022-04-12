package Pgms;

public class apartOfDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(c!=s.charAt(i)) {
					System.out.println(s);
					
				}else {
					
				}
				
			}
		}

	}

}
