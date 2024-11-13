package aula10;

import java.util.Scanner;

public class MoradorUtil {

    static final int QTD = 2;
    static Morador[] candidatos = new Morador[QTD];
    static Scanner scanner = null;
    
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
	    		case 1: listarVotos(); break;
	    		case 2:	registrarVoto(); break;
    		}

    	} while (opcao != 3);
    	
    	scanner.close();
    }
    
    public static void lerDadosCandidatos() {
    	for (int i = 0; i < QTD; i++) {
    		System.out.println("CANDIDATO " + (i + 1));
    		System.out.print("Nome.....................: ");
    		String nome = scanner.nextLine();
    		System.out.print("Unidade..................: ");
    		int unidade = scanner.nextInt();
    		System.out.print("Residentes...............: ");
    		int residentes = scanner.nextInt();
    		System.out.print("Número para ser votado(a): ");
    		int numeroVotacao = scanner.nextInt();
    		
    		candidatos[i] = new Morador(nome, unidade, residentes, numeroVotacao);

    		scanner.nextLine();

    		System.out.println();
    	}
    }
    
    public static void menu() {
		System.out.println("OPERAÇÕES ");
		System.out.println("1 - Listar Votos Recebidos");
		System.out.println("2 - Registrar Voto");
		System.out.println("3 - Encerrar Programa");
    }

    public static void registrarVoto() {
		System.out.print("Número do(a) morador(a) candidato(a): ");
		int voto = scanner.nextInt();
    	
		scanner.nextLine();
		
		System.out.println("APURAÇÃO PARCIAL DE VOTAÇÃO");

		for (int i = 0; i < QTD; i++) {
			int numeroMorador = candidatos[i].getNumeroVotacao();
			
			if (numeroMorador == voto) {
				candidatos[i].adicionarVoto();
				break;
			}
    	}
		
		System.out.println();
		
    }
    
    public static void listarVotos() {
		System.out.println("APURAÇÃO PARCIAL DE VOTAÇÃO");

		for (int i = 0; i < QTD; i++) {
    		String morador = candidatos[i].getNome();
    		int votos = candidatos[i].getVotos();
    		System.out.println("Candidato [" + morador + "] com " + votos + " voto(a)s");
    	}
		
		System.out.println();
    }
    
}
