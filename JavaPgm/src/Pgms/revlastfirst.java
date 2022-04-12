package Pgms;

public class revlastfirst {

	public static void main(String[] args) {
		String s = "My Branch is Computer Science";
		String[] remsg1=s.split(" ");
		System.out.print(remsg1[remsg1.length-1]+" ");
		for(int i=1;i<remsg1.length-1;i++) {
			System.out.print(remsg1[i]+" ");
		}
	System.out.print(remsg1[0]);

	}

}
