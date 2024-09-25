package aula04;

import java.util.Random;

public class SomadorAleatorio extends Thread {

    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int PAUSA = 5;

    private int soma;

    public int getSoma() {
        return soma;
    }

    public void run() {
        Random random = new Random();

        while (true) {
            int n = random.nextInt(MIN, MAX + 1);
            soma += n;
            try {
                sleep(PAUSA * 1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
