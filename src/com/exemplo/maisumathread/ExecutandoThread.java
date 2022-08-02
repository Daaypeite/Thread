package com.exemplo.maisumathread;

public class ExecutandoThread {

	public static void main(String[] args) throws InterruptedException {
		// praticar as instancias das threads
		NotificacaoUm n1 = new NotificacaoUm();
		NotificacaoDois n2 = new NotificacaoDois(n1);
		NotificacaoTres n3 = new NotificacaoTres(n1);

		// criando as Threads
		Thread t1 = new Thread(n1, "Thread Um");
		Thread t2 = new Thread(n2, "Thread Dois");
		Thread t3 = new Thread(n3, "Thread Tres");

		// inicializando thread com a chamada do metodo run()
		t1.start();
		t2.start();
		Thread.sleep(3000);
		t3.start();
	}

}
