package Pgms;

public class printTheNumFromCharactersAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kjh3535zcsc3546f8d7d";
		int sum=0;
		String  num = "0";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {  
				
				num=num+s.charAt(i);
			}else {
				sum=sum+Integer.parseInt(num);
				num="0";
			}
		}
		System.out.println(sum+Integer.parseInt(num));

	}

}
