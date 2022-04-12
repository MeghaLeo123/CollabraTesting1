package Pgms;

public class reverseStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stmt = "TY is the best";
		String revstmt[] = stmt.split(" ");
		for(int i=revstmt.length-1;i>=0;i--) {
			System.out.print(revstmt[i]+" ");
		}
		

	}

}
