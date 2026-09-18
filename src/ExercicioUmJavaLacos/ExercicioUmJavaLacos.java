package ExercicioUmJavaLacos;

import java.util.Scanner;

//Escreva um codigo onde o usuario entra com um numero e seja gerada a tabuada de 1 ate 10 desse numero
public class ExercicioUmJavaLacos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        input.close();
    }
}
