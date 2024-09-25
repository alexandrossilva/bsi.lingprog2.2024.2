package aula04;

import java.util.Random;
import java.util.Scanner;

public class GeracaoNumeroAleatorio {
    
    public static void main(String[] args) {
        int n1, n2, r;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Digite intervalo: ");

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        r = random.nextInt(n1, n2 + 1);

        System.out.println("Número pseudoaleatório: " + r);

        scanner.close();
    }

}
