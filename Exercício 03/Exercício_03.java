import java.util.Scanner;

public class Exercício_03 {
    public static void main(String[] args) {
        //Desenvolva um programa que receba três números do
        //usuário e determine qual é o maior.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um primeiro número: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Digite um segundo número: ");
        float numero2 = scanner.nextFloat();
        System.out.println("Digite um terceiro número: ");
        float numero3 = scanner.nextFloat();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("O primeiro número digitado é o maior!"); }
            if (numero2 > numero1 && numero2 > numero3){
                System.out.println("O segundo número digitado é o maior!");}
                if (numero3 > numero1 && numero3 > numero2){
                    System.out.println("O terceiro número digitado é o maior");
                } if (numero1 == numero2 && numero1 == numero3){
            System.out.println("Os números são iguais.");}}}

