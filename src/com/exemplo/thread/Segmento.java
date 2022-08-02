package com.exemplo.thread;

public class Segmento extends Thread {
	public void run() {
		int i = 0;
		while(i <= 5) {
		System.out.println("Algo executando na Classe Segmento");
		i++;
		}
}
}