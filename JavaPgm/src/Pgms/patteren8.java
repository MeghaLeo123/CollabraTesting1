package Pgms;

public class patteren8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=5;
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {    //j=i;j<4
				System.out.print("*");
			}
			System.out.println();
		}
	}

}



