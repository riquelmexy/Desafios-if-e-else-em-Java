import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        // Escreva um programa que peça ao usuário para inserir um
        //ano e determine se esse ano é bissexto ou não.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }

}
