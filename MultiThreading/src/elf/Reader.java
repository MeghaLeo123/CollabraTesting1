package elf;

public class Reader extends Thread {
Book b;
Reader(Book b)
{
	this.b=b;
}
@Override
public void run() {
	b.read();
}
}
