package ExercicioTresJavaFundamentos;

import java.util.Scanner;

//Escreva um codigo que receba a base e a altura de um retangulo, calcule sua area e exiba na tela;
public class ExercicioTresJavaFundamentos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        double base = s.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        double altura = s.nextDouble();

        double area = base * altura;

        System.out.println("A area do retangulo é: " + area);

        s.close();
    }
}
