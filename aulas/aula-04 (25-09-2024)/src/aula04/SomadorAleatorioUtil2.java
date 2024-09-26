package aula04;

import java.util.Scanner;

public class SomadorAleatorioUtil2 {
        
    public static void main(String[] args) {
        SomadorAleatorioInterface somador = new SomadorAleatorioInterface();
        Thread thread = new Thread(somador);
        Scanner scanner = new Scanner(System.in);

        thread.start();
        String resp;

        do {
            System.out.print("Consultar Somador ou Encerrar (C/E)? ");
            resp = scanner.nextLine();

            if (resp.toLowerCase().charAt(0) == 'c')
                System.out.println("Soma: " + somador.getSoma());            
        } while (resp.toLowerCase().charAt(0) != 'e');

        thread.interrupt();

        scanner.close();
    }

}