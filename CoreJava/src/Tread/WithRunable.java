package Tread;

import Constructor1.Hello;

public class WithRunable implements Runnable {

	private String name = null;

	public WithRunable(String name) {

		this.name = name;

	}

	public String getName() {

		return name;
	}

	
	  @Override public void run() {
	  
	  System.out.println("Hello from Tread !");
	  
	  }
	 
}
