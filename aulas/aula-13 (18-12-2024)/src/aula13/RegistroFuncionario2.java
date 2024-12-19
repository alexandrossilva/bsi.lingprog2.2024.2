package aula13;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroFuncionario2 {

	public static void main(String[] args) {
		int op;
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		do {
			System.out.println("********* OPERAÇÕES *********");
			System.out.println("* 1 - CADASTRAR FUNCIONÁRIO *");
			System.out.println("* 2 - GRAVAR FUNCIONÁRIOS   *");
			System.out.println("* 3 - ENCERRAR              *");
			System.out.println("*****************************");

			System.out.println();
			System.out.print("Digite Operação (1-3): ");
			op = scanner.nextInt();
		} while (op != 3);
		
		scanner.close();
	}

}