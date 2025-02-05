package aula14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroFuncionarios {

	private static List<Funcionario> lista = new ArrayList<Funcionario>();
	private static Scanner scanner = null;

	public static void main(String[] args) {
		int op;
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("********* OPERAÇÕES *********");
			System.out.println("* 1 - CADASTRAR FUNCIONÁRIO *");
			System.out.println("* 2 - LISTAR FUNCIONÁRIOS   *");
			System.out.println("* 3 - GRAVAR FUNCIONÁRIOS   *");
			System.out.println("* 4 - ENCERRAR              *");
			System.out.println("*****************************");

			System.out.println();
			System.out.print("Digite Operação (1-4): ");
			op = scanner.nextInt();
			scanner.nextLine();

			switch (op) {
				case 1: cadastrarFuncionario(); break;
				case 2: listarFuncionarios(); break;
				case 3: gravarFuncionarios(); break;
			}
		} while (op != 4);

		scanner.close();
	}

	public static void cadastrarFuncionario() {
		System.out.print("Nome (Funcionário)...: ");
		String nome = scanner.nextLine();
		System.out.print("Salário (Funcionário): ");
		double salario = scanner.nextDouble();
		scanner.nextLine();

		Funcionario func = new Funcionario(nome, salario);

		lista.add(func);
	}

	public static void listarFuncionarios() {
		System.out.println("LISTA");
		for (Funcionario func: lista) {
			System.out.println(func.getNome() + " - Salário: " + func.getSalario());			
		}
	}

	public static void gravarFuncionarios() {
		FileWriter fluxoEscrita = null;
		try {
			fluxoEscrita = new FileWriter("funcionarios.txt");

			for (Funcionario func: lista) {
				fluxoEscrita.write(func.getNome() + "|" + func.getSalario() +
						System.lineSeparator());			
			}		
			
			if (fluxoEscrita != null)
				fluxoEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}