package aula03;

public class ContadorParametrizadoThread extends Thread {

	private int segundosEspera;

	public ContadorParametrizadoThread(int segundosEspera) {
		this.segundosEspera = segundosEspera;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contagem Atual de " + getName() + ": " + i);
			try {
				sleep(this.segundosEspera * 1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}