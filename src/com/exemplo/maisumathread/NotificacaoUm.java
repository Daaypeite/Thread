package com.exemplo.maisumathread;

public class NotificacaoUm extends Thread {
	// metodo run()
	public void run() {
		synchronized (this) {
			System.out.println("Inicializacao de: " + Thread.currentThread().getName());
			// bloco try/catch
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...notificada");
		} 
	}
}
