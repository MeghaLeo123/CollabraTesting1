package elf;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinesh d = new Dinesh();
		Rohit r =new Rohit();
		d.start();
		r.start();

	}
}