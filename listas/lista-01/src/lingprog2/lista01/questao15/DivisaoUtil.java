package lingprog2.lista01.questao15;

import java.util.Scanner;

public class DivisaoUtil {

	public static void main(String[] args) {
		int x, y, r;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Operação de Divisão\n");

		// entrada de dois números inteiros
		System.out.print("Informe Dividendo...: ");
		x = scanner.nextInt();
		System.out.print("Informe Divisor.....: ");
		y = scanner.nextInt();

		r = x / y;      // divisão entre dois números inteiros informados

		// exibição de resultado da divisão
		System.out.println("\nResultado da Divisão: " + r);

		scanner.close();
	}
	
}