package Pgms;

public class largeAndSmallFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,1,4,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
		}
			System.out.println(arr[arr.length-1]);
			System.out.println(arr[0]);
		}
	}

		
		

