package Pgms;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="KARNATAKA";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='A') {
				count++;
			}
		}
		System.out.println(count);

	}

}
