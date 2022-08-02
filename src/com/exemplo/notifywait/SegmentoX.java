package com.exemplo.notifywait;

public class SegmentoX {

	public static void main(String[] args) {
		// praticando a instancia da classe SegmentoY
		SegmentoY y = new SegmentoY();
		// inicializar a Thread
		y.start();

		// sincronizando/bloqueando o objeto y
		synchronized (y) {
			// bloco try/catch
			try {
				System.out.println("Esperando que Y seja executado.....");
				y.wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		// exibir o valor do atributo montante
		System.out.println("O montante de y é: " + y.montante);
	}

}
