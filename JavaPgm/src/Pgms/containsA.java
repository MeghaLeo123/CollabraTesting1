package Pgms;

public class containsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"Amn","Ashish","Asif","Vinod","Harish","Kavya","Manu"};
		for(String names:name) {
//			for(int i=0;i<names.length()-1;i++) {
//				
//			if(names.charAt(i)=='A' || names.charAt(i)=='a') {
//				System.out.println(names);
//			}
		if(names.contains("a")||names.contains("A")) {
			System.out.println(names);
		}
		}
	}
}
	
//				

