package elf;

public class p3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Name of the thread"+Thread.currentThread().getName());
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();
		t1.start();
		t2.start();
		for(int i=1;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println("Happ singles day");
		
		}
		
	
	
	}
	
	

}
