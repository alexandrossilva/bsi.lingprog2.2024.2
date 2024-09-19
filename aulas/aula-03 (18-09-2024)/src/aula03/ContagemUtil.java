package aula03;

public class ContagemUtil {

	public static void main(String[] args) {
		ContadorThread t1 = new ContadorThread();
		ContadorLentoThread t2 = new ContadorLentoThread();

		t1.setName("Contador 1");
		t2.setName("Contador 2");

		t1.start();
		t2.start();
	}

}