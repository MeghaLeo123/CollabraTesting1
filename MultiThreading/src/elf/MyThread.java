package elf;

public class MyThread extends Thread {
@Override
public void run() {
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sorry....How are u");
	}
}
}
