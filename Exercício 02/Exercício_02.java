import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {
        //Crie um programa que peça ao usuário para inserir sua
        //nota final em uma disciplina. Em seguida o programa deve
        //decidir e exibir se o aluno foi aprovado, reprovado ou se ficou
        //de exame:
        //● Aprovado: Nota superiores ou iguais a 6
        //● Reprovado: Notas inferiores a 2
        //● Exame: Notas entre 2 e 5,99

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota final: ");
        float nota = scanner.nextFloat();
        if(nota >= 0 && nota <= 2){
            System.out.println("Reprovado.");
        } if (nota > 2 && nota < 6 ){
            System.out.println("Exame");
        } if (nota >= 6 && nota <11){
            System.out.println("Aprovado.");
        } if (nota >10){
            System.out.println("A nota máxima é 10.");
        }
    }
}
