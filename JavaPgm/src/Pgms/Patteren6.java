package Pgms;

public class Patteren6 {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		for(int i=1;i<=row;i++) {
			int n=i;	
			for(int j=1;j<=col;j++) {
				
			System.out.print(n+" ");
			n=n+5;
			}
			System.out.println();
		}
		}
	
	}
