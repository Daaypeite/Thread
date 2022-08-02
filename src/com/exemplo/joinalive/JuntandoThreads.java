package com.exemplo.joinalive;

public class JuntandoThreads {

	public static void main(String[] args) throws Exception{
		// criar uma nova thread e tentar juntar a thread existente 
		Thread t = new Thread(new Thread());
		
		//inicializando a Thread
		t.start();
		
		// tentando juntar as Thread
		t.join(2000);
		
		System.out.println("Fazendo ajuncao depois de 2 segundos: \n");
		System.out.println("Thread atual: " + t.getName());
		
		// observando se a thread esta viva
		System.out.println("Thread, voce esta viva, né? " + t.isAlive());
	}

}
