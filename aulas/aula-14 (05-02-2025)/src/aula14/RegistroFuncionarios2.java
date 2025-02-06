package aula14;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RegistroFuncionarios2 {

	private static List<Funcionario> lista = new ArrayList<Funcionario>();
	private static Scanner scanner = null;

	public static void main(String[] args) {
		int op;
		scanner = new Scanner(System.in);
		
		lerFuncionarios();
		
		do {
			System.out.println("********* OPERAÇÕES *********");
			System.out.println("* 1 - CADASTRAR FUNCIONÁRIO *");
			System.out.println("* 2 - LISTAR FUNCIONÁRIOS   *");
			System.out.println("* 3 - ENCERRAR              *");
			System.out.println("*****************************");

			System.out.println();
			System.out.print("Digite Operação (1-3): ");
			op = scanner.nextInt();
			scanner.nextLine();

			switch (op) {
				case 1: cadastrarFuncionario(); break;
				case 2: listarFuncionarios(); break;
			}
		} while (op != 3);

		gravarFuncionarios();
		
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
		PrintWriter fluxoEscrita = null;
		try {
			fluxoEscrita = new PrintWriter("funcionarios.txt");

			for (Funcionario func: lista) {
				fluxoEscrita.println(func.getNome() + "|" + func.getSalario());			
			}		
			
			if (fluxoEscrita != null)
				fluxoEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void lerFuncionarios() {
		FileReader fluxoLeitura = null;
		try {
			fluxoLeitura = new FileReader("funcionarios.txt");

			Scanner scannerLeitura = new Scanner(fluxoLeitura);
			
			while (scannerLeitura.hasNext()) {
				String linha = scannerLeitura.nextLine();
				
				StringTokenizer separador = new StringTokenizer(linha, "|");
				
				String nome = separador.nextToken();
				double salario = Double.parseDouble(separador.nextToken());
				
				Funcionario func = new Funcionario(nome, salario);
				
				lista.add(func);
			}

			if (scannerLeitura != null)
				scannerLeitura.close();

			if (fluxoLeitura != null)
				fluxoLeitura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}