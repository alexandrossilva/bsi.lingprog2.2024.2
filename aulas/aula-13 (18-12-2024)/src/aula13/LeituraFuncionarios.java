package aula13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraFuncionarios {

	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			FileReader leitor = new FileReader("funcionario.txt");
			scanner = new Scanner(leitor);
				
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());				
			}
			
			leitor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo a ser lido inexistente!");
		}
		catch (IOException e) {
			System.out.println("Erro de entrada/saída!");
		}
		
		scanner.close();
	}

}