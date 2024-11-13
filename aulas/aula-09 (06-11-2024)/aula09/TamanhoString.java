package aula09;

import java.util.Scanner;

public class TamanhoString {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome de um animal: ");
        String animal = scanner.nextLine();
        System.out.print("[" + animal + "] tem " + animal.length() + " letra(s)");
    }
	
}
