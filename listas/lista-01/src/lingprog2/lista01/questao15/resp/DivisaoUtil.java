package lingprog2.lista01.questao15.resp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoUtil {

   public static void main(String[] args) {
      int x = 0;
      int y = 0;
      int r;
      boolean isFalhaEntrada;      
      Scanner scanner       = new Scanner(System.in);

      System.out.println("Operação de Divisão\n");

      isFalhaEntrada = true;
      
      // bloco de repetição enquanto entrada de dividendo for inválida
      do {
         try {
            System.out.print("Informe Dividendo...: ");
            x = scanner.nextInt();      // entrada de dividendo
            // atualização de variável de controle para encerramento de bloco de repetição
            isFalhaEntrada = false;
         }
         catch(InputMismatchException e) {
            System.out.println("ENTRADA INVÁLIDA!");
            scanner.next();
         }
      } while (isFalhaEntrada);

      isFalhaEntrada = true;
      
      // bloco de repetição enquanto entrada de divisor for inválida
      do {
         try {
            System.out.print("Informe Divisor.....: ");
            y = scanner.nextInt();      // entrada de divisor
            // atualização de variável de controle para encerramento de bloco de repetição
            isFalhaEntrada = false;
         }
         catch(InputMismatchException e) {
            System.out.println("ENTRADA INVÁLIDA!");
            scanner.next();
         }
      } while (isFalhaEntrada);

      try {
         r = x / y;                     // realização de divisão
         System.out.println("\nResultado da Divisão: " + r);         
      }
      catch(ArithmeticException e) {
         System.out.println("\nErro aritmético ao processar divisão!");         
      }

      scanner.close();
   }

}