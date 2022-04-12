package elf;

public class Rohit extends Thread {
	public static synchronized void getkey() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Dinesh.getkey();
		System.out.println("Dinesh got key");

	}
	public void run() {
		System.out.println("Going toget the key");
		getkey();
		System.out.println("Rohit got a key");
	}

}
