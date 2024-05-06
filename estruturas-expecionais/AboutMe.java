import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        String altura = scanner.next();

        System.out.println("Óla, me chamo " + nome.toLowerCase() + " ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
        }
        catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser númericos!");
        }
    }
}
