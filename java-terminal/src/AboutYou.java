import java.util.Scanner;
import java.util.Locale;

public class AboutYou {
    public static void main (String []args){
        
        String separacao = "========================================";
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.print("Seu nome: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Peso(kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Altura(m): ");
        double altura = scanner.nextDouble();

        System.out.println(separacao);
        System.out.println("----------Suas informações----------\n");
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua Idade é ");
        System.out.println("Seu peso é " + peso + "kg");
        System.out.println("Sua altura é " + altura + "m");

    }
}
