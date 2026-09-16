package ExercicioQuatroJavaFundamentos;

import java.util.Scanner;
//Escreva um codigo que receba o nome e a idade de 2 pessoas e imprima a diferenca de idade entre elas;
public class ExercicioQuatroJavaFundamentos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa 1: ");
        String nome1 = s.nextLine();
        System.out.println("Digite a idade da pessoa 1: ");
        int idade1 = s.nextInt();

        s.nextLine();

        System.out.println("Digite o nome da pessoa 2: ");
        String nome2 = s.nextLine();
        System.out.println("Digite a idade da pessoa 2: ");
        int idade2 = s.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.printf("A diferenca de idade entre %s e %s é: %d anos de diferença!", nome1, nome2, diferenca);

        s.close();
    }
}
