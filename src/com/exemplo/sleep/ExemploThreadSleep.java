package com.exemplo.sleep;

public class ExemploThreadSleep {

	public static void main(String[] args) {
		// iniciando uma nova thread
		Thread fofinho = Thread.currentThread();

		System.out.println("[Nome, mudou de prioridade, mesmo grupo]: " + fofinho);
		fofinho.setName("Teste");
		fofinho.setPriority(8);
		System.out.println("[Nome, mudou de prioridade, mesmo grupo]: " + fofinho);

		// bloco try/catch
		try {
			for (int x = 1; x < 10; x++) {
				System.out.println(x);
				Thread.sleep(4000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
