package aula05;

import java.util.Scanner;

public class SomadorAleatorioUtil3 {
        
    public static void main(String[] args) {
        final int QTD = 3;

        SomadorAleatorio[] somador = new SomadorAleatorio[QTD];

        for (int i = 0; i < QTD; i++)
            somador[i] = new SomadorAleatorio();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < QTD; i++)
            somador[i].start();

        String resp;

        do {
            System.out.print("Consultar Somador ou Encerrar (C/E)? ");
            resp = scanner.nextLine();

            if (resp.toLowerCase().charAt(0) == 'c') {
                for (int i = 0; i < QTD; i++)
                    System.out.println("Soma " + i + ": " + somador[i].getSoma());

                int maior = somador[0].getSoma();

                for (int i = 1; i < QTD; i++)
                    if (somador[i].getSoma() > maior) {
                        maior = somador[i].getSoma();
                    }

                System.out.println("Maior Soma: " + maior);
            }
        } while (resp.toLowerCase().charAt(0) != 'e');

        for (int i = 0; i < QTD; i++)
            somador[i].desativar();

        scanner.close();
    }

}