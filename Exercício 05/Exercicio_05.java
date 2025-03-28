import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        //Crie um programa que permita ao usuário escolher entre
        //converter uma temperatura de Celsius para Fahrenheit ou de
        //Fahrenheit para Celsius. O programa deve solicitar a
        //temperatura e realizar as conversão de acordo com a escolha
        //do usuário.
        //● Celsius = (Fahrenheit - 32) / 1.8
        //● Fahrenheit = 1,8*Celsius + 32
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a conversão: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("Opção: ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println("Temperatura em Celsius " + celsius);
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
        }
    }
}
