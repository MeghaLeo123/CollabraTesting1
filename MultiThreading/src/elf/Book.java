package elf;

public class Book {
	String title;
	public Object write;
	Book(String title)
	{
		this.title=title;
	}
	
	public void read() {
		// TODO Auto-generated method stub
		for(int i=0;i<title.length();i++) {
			
		
		System.out.println(title.charAt(i));
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

public void write()
{
	try {
		Thread.sleep(5000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	title="Romeo Huliet";
}
}
	
	

