package com.exemplo.notifywait;

public class SegmentoY extends Thread {
	// atributo
	int montante;

	// metodo run()
	public void run() {
		synchronized (this) {
			for (int a = 0; a <= 10; a++) {
				montante += a;
			}
			notify();
		}
	}
}
