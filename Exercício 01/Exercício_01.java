import java.util.Scanner;

public class Exercício_01 {
    public static void main(String[] args) {
        //Escreva um programa em Java que solicite ao usuário um
        //número inteiro e em seguida determine e imprima se o número
        //é par ou ímpar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("O número "+ numero +" é par.");
        } else System.out.println(("o número "+ numero+" é impar"));
    }
}
