package aula03;

public class ContagemUtil2 {

	public static void main(String[] args) {
		Thread t1 = new ContadorParametrizadoThread(10);
		Thread t2 = new ContadorParametrizadoThread(3);

		t1.setName("Contador 1");
		t2.setName("Contador 2");

		t1.start();
		t2.start();
	}

}