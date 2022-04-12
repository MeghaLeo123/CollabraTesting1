package Pgms;

public class reverseStmt {

	public static void main(String[] args) {
		String revStmt ="My Branch is Computer Science";
		String revmsg[]= revStmt.split(" ");
		for(int i=revmsg.length -1;i>=0;i--) {
			System.out.print(revmsg[i]+" ");
		}
		


	}

}
