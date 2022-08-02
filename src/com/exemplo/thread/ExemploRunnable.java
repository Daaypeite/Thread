package com.exemplo.thread;

public class ExemploRunnable extends Thread implements Runnable {
	public void run() {
		int i = 0;
		while (i <= 5) {
			System.out.println("umaMensagem");
			i++;
		}
	}

}
