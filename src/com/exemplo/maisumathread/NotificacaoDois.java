package com.exemplo.maisumathread;

public class NotificacaoDois extends Thread {
	// declarando um atributo
	NotificacaoUm n1;

	// construtor
	public NotificacaoDois(NotificacaoUm n1) {
		this.n1 = n1;
	}

	// metodo run()
	public void run() {
		synchronized (this.n1) {
			System.out.println("Inicializando " + Thread.currentThread().getName());

		}
		// bolo try/catch
		try {
			this.n1.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "...notificada!");
	}

}
