package aula14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroFuncionarios3 {

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
		FileOutputStream fluxoEscrita = null;
		ObjectOutputStream fluxoEscritaObjetos = null;
		
		try {
			fluxoEscrita = new FileOutputStream("funcionarios-objetos.txt");
			fluxoEscritaObjetos = new ObjectOutputStream(fluxoEscrita);

			fluxoEscritaObjetos.writeObject(lista);
			
			if (fluxoEscritaObjetos != null)
				fluxoEscritaObjetos.close();
			if (fluxoEscrita != null)
				fluxoEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void lerFuncionarios() {
		FileInputStream fluxoLeitura = null;
		ObjectInputStream fluxoLeituraObjetos = null;
		
		try {
			fluxoLeitura = new FileInputStream("funcionarios-objetos.txt");
			fluxoLeituraObjetos = new ObjectInputStream(fluxoLeitura);

			lista = (List<Funcionario>)fluxoLeituraObjetos.readObject();
			
			if (fluxoLeituraObjetos != null)
				fluxoLeituraObjetos.close();
			if (fluxoLeitura != null)
				fluxoLeitura.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}