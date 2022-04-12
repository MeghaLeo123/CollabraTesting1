package Pgms;

public class startingFromA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= {"Aman","Abid","Ajay","Meghana","Sinchana"};
		for(String names:name) {
			if(names.charAt(0)=='M') {
				System.out.println(names);
			}
		}
	}

}
