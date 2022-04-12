package elf;

public class writer extends Thread {
	Book b;
	writer(Book b){
		this.b=b;
	}
	public void write() {
		b.write;
	}

}
