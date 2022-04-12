package elf;

public class Dinesh extends Thread {
public static synchronized void getkey() {
	
try {
	Thread.sleep(1000);
}catch(InterruptedException e) {
	e.printStackTrace();
}
   Rohit.getkey();	
   System.out.println("Rohit got akey");
}
public void run() {
		System.out.println("Going toget a key");
	getkey();
	System.out.println("Dinesh got the key");
	}
	
}
