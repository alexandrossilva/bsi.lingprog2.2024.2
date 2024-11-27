package aula11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoradorUtil {

    static List<Morador> candidatos = new LinkedList<Morador>();
    static Scanner scanner;
    
    public static void main(String[] args) {
    	scanner = new Scanner(System.in);
    	
    	lerDadosCandidatos();
    	
    	int opcao;
    	
    	do {
    		menu();
    		
    		System.out.print("Operacao (1-3): ");
    		opcao = scanner.nextInt();

    		scanner.nextLine();
    		
    		switch(opcao) {
	    		case 1: listarMoradoresSolitarios(); break;
	    		case 2:	listarMoradoresNaoSolitarios(); break;
	    		case 3: listarVotos(); break;
	    		case 4:	registrarVoto(); break;
    		}

    	} while (opcao != 5);
    	
    	scanner.close();
    }
    
    public static void lerDadosCandidatos() {
    	System.out.print("Quantidade de Candidatos: ");
    	int qtd = scanner.nextInt();
    	
    	scanner.nextLine();
    	    	
    	for (int i = 0; i < qtd; i++) {
    		System.out.println("CANDIDATO " + (i + 1));
    		System.out.print("Nome.....................: ");
    		String nome = scanner.nextLine();
    		System.out.print("Unidade..................: ");
    		int unidade = scanner.nextInt();
    		System.out.print("Residentes...............: ");
    		int residentes = scanner.nextInt();
    		System.out.print("Número para ser votado(a): ");
    		int numeroVotacao = scanner.nextInt();
    		
    		Morador m = new Morador(nome, unidade, residentes, numeroVotacao);
    		
    		candidatos.add(m);

    		scanner.nextLine();

    		System.out.println();
    	}
    }
    
    public static void menu() {
		System.out.println("OPERAÇÕES ");
		System.out.println("1 - Listar Candidatos Solitários");
		System.out.println("2 - Listar Candidatos Não Solitários");
		System.out.println("3 - Listar Votos Recebidos");
		System.out.println("4 - Registrar Voto");
		System.out.println("5 - Encerrar Programa");
    }

    public static void registrarVoto() {
		System.out.print("Número do(a) morador(a) candidato(a): ");
		int voto = scanner.nextInt();
    	
		scanner.nextLine();
		
		System.out.println("APURAÇÃO PARCIAL DE VOTAÇÃO");

		for (int i = 0; i < candidatos.size(); i++) {
			Morador m = candidatos.get(i);
			int numeroMorador = m.getNumeroVotacao();
			
			if (numeroMorador == voto) {
				m.adicionarVoto();
				break;
			}
    	}
		
		System.out.println();
		
    }
    
    public static void listarVotos() {
		System.out.println("APURAÇÃO PARCIAL DE VOTAÇÃO");

		for (int i = 0; i < candidatos.size(); i++) {
			Morador m = candidatos.get(i);
    		String morador = m.getNome();
    		int votos = m.getVotos();
    		System.out.println("Candidato [" + morador + "] com " + votos + " voto(a)s");
    	}
		
		System.out.println();
    }
    
    public static void listarMoradoresSolitarios() {
		System.out.println("MORADORES SOLITÁRIO(A)S");

		for (int i = 0; i < candidatos.size(); i++) {
			Morador m = candidatos.get(i);
			if (m.getQuantidadeResidentesUnidade() == 1)
				System.out.println(m.getNome());
    	}
		
		System.out.println();
    }
    

    public static void listarMoradoresNaoSolitarios() {
		System.out.println("MORADORES NÃO SOLITÁRIO(A)S");

		for (int i = 0; i < candidatos.size(); i++) {
			Morador m = candidatos.get(i);
			if (m.getQuantidadeResidentesUnidade() != 1)
				System.out.println(m.getNome());
    	}
		
		System.out.println();
    }
    
}
