import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Crie um programa que peça para o usuário inserir um
        //número, e em seguida informe se o número é positivo, negativo
        //ou zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por gentileza, digite um número: ");

        float numero = scanner.nextFloat();
      if ( numero == 0 ) {
         System.out.println("O número é zero.");
     } if (numero > 0) {
             System.out.println("Número positivo");
     } if (numero < 0) {
                 System.out.println("Número negativo");
             }
         }
     }

