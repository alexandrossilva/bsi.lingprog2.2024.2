package aula04;

import java.util.Scanner;

public class SomadorAleatorioUtil {
        
    public static void main(String[] args) {
        SomadorAleatorio somador = new SomadorAleatorio();
        Scanner scanner = new Scanner(System.in);

        somador.start();
        String resp;

        do {
            System.out.print("Consultar Somador ou Encerrar (C/E)? ");
            resp = scanner.nextLine();

            if (resp.toLowerCase().charAt(0) == 'c')
                System.out.println("Soma: " + somador.getSoma());            
        } while (resp.toLowerCase().charAt(0) != 'e');

        somador.interrupt();

        scanner.close();
    }

}