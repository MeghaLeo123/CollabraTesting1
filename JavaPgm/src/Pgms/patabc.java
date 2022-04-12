package Pgms;

public class patabc {

	public static void main(String[] args) {
		
		int row=4;
		int col=4;
		
		
		for(int i=0;i<row;i++) {
			char c= 'A';
			for(int j=0;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			
			System.out.println();
		}
		

	}

}
