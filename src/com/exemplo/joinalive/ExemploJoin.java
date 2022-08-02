package com.exemplo.joinalive;

public class ExemploJoin implements Runnable {

		// implementar o metodo run()
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread atual: " + t.getName());
	
		// observar se essa thread esta viva
		System.out.println("Thread, voce esta viva? " + t.isAlive());
	}
}
