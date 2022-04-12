package elf;

import java.io.Writer;

public class BookDriver {
	public static void main(String[] args) {
		Book b= new Book("Harry Potter");
		Reader r = new Reader(b);
		writer w =new writer(b);
		r.start();
		w.start();
	}

}
