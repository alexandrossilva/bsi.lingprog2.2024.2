package aula03;

public class ContadorLentoThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contagem Atual de " + getName() + ": " + i);
			try {
				sleep(5 * 1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}