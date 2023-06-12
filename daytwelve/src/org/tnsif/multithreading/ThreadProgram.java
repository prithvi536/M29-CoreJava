//program to demonstrate on creating a thread by extending a thread class
package org.tnsif.multithreading;

public class ThreadProgram extends Thread {
	
	public void run() {
		System.out.println("Thread is in running state");
		
	}

	public static void main(String[] args) {
		ThreadProgram t = new ThreadProgram();
		t.start();
	}
}
