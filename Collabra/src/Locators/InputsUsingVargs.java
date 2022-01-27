package Locators;

public class InputsUsingVargs implements Calculator {
	public int add(int...arr) {
		int sum=0;
		for(int a: arr)
		{
			sum=sum + a;
		}
		/*for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}*/
		return sum;
		}
	public int sub(int a, int b)
	{
		return a-b;
		
	}
    public int multipy(int a,int b)
    {
	   return a*b;
    }
}
