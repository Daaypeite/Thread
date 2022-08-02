package com.exemplo.thread;

public class ExecutarThreads extends Thread {

	// criar um atributo privado
	private String mensagem;

	// criar um metodo
	public ExecutarThreads(String mensagem) {
		this.mensagem = mensagem;
	}

	// usando o metodo run()
	public void run() {
		// loop para iterar por valores - sejam eles quantos forem
		while (true) {
			System.out.println(mensagem);
		}
	}

	public static void main(String[] args) {
		// praticando a instancia da classe
		ExecutarThreads objThread = new ExecutarThreads("Executando uma Thread??");
		objThread.start();
		while (true) {
			System.out.println("Executando a tread principal");
		}
		// objSeg.run("Texto bacana!");
	}

}
