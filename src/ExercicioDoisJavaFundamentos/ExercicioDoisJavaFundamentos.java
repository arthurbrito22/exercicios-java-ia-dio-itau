package ExercicioDoisJavaFundamentos;

import java.math.BigDecimal;
import java.util.Scanner;

//Escreva um codigo que receba o tamanho do lado de um quadrado, calcule sua area e exiba na tela
public class ExercicioDoisJavaFundamentos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        String entrada = s.next();

        BigDecimal ladoQuadrado = new BigDecimal(entrada);
        BigDecimal areaQuadrado = ladoQuadrado.multiply(ladoQuadrado);

        System.out.println("A area do quadrado é: " + areaQuadrado);

    }
}
