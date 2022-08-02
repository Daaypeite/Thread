package com.exemplo.maisumathread;

public class NotificacaoTres extends Thread {
	// declarando um atributo
	NotificacaoUm n1;

	// construtor
	public NotificacaoTres(NotificacaoUm n1) {
		this.n1 = n1;
	}

	// metodo run()
	public void run() {
		synchronized (this.n1) {
			System.out.println("Inicializando " + Thread.currentThread().getName());

			/*
			 * } // bolo try/catch try { this.n1.wait(); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
			
			// chamada do metodo notify
			this.n1.notify();
			System.out.println(Thread.currentThread().getName() + "...notificada!");
		}

	}
}
