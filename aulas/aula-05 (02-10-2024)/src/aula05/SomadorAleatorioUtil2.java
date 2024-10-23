package aula05;

import java.util.Scanner;

public class SomadorAleatorioUtil2 {
        
    public static void main(String[] args) {
        SomadorAleatorio[] somador = new SomadorAleatorio[3];
        somador[0] = new SomadorAleatorio();
        somador[1] = new SomadorAleatorio();
        somador[2] = new SomadorAleatorio();

        Scanner scanner = new Scanner(System.in);

        somador[0].start();
        somador[1].start();
        somador[2].start();

        String resp;

        do {
            System.out.print("Consultar Somador ou Encerrar (C/E)? ");
            resp = scanner.nextLine();

            if (resp.toLowerCase().charAt(0) == 'c') {
                int s1 = somador[0].getSoma();
                int s2 = somador[1].getSoma();
                int s3 = somador[2].getSoma();

                System.out.println("Soma 1: " + s1);
                System.out.println("Soma 2: " + s2);
                System.out.println("Soma 3: " + s3);

                int maior = s1;
                if (s2 > maior) { maior = s2; }
                if (s3 > maior) { maior = s3; }

                System.out.println("Maior Soma: " + maior);
            }
        } while (resp.toLowerCase().charAt(0) != 'e');

        somador[0].desativar();
        somador[1].desativar();
        somador[2].desativar();

        scanner.close();
    }

}