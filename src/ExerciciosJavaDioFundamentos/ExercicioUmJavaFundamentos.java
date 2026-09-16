package ExerciciosJavaDioFundamentos;
import java.time.OffsetDateTime;
import java.util.Scanner;


//Escreva um codigo que receba o nome e o ano de nascimento de alguem na tela e imprima "Ola 'Fulano' voce tem 'X' anos!"
public class ExercicioUmJavaFundamentos {

        public static void main(String[] args) {
            var currentYear = OffsetDateTime.now().getYear();
            Scanner s = new Scanner(System.in);

            System.out.println("Ola! Digite seu nome: ");
            String nome = s.nextLine();

            System.out.println("Agora digite o ano do seu nascimento: ");
            int anoNascimento = s.nextInt();

            int idade = currentYear - anoNascimento;

            System.out.printf("Ola %s voce tem %d anos!", nome, idade);

            s.close();
        }
    }