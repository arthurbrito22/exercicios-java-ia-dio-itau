package ExercicoDoisJavaLacos;

import java.util.Scanner;

public class ExercicoDoisJavaLacos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite sua peso(Ex: 1,75): ");
        double peso = sc.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("Seu IMC: %.2f\n", imc);

        if(imc<=18.5){
            System.out.println("Abaixo do peso");
        } else if (imc<=24.9) {
            System.out.println("Peso Ideal");
        } else if (imc<= 29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc<= 34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc<= 39.9) {
            System.out.println("Obesidade Grau II(Severa)");
        }else {
            System.out.println("Obesidade Grau III(Morbida)");
        }
        sc.close();
    }
}
