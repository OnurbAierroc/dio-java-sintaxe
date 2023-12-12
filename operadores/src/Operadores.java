public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String separacao = "=========================";

        System.out.println(separacao);
        System.out.println("Operadores Matematicos\n");
        System.out.println("Soma +\nSubtração -\nMultiplicação *\nDivisão \\ \nResultado da Divisão %\n");

        int n1 = 11;
        int n2 = 3;

        double divisaoSobra = n1%n2;
        double divisaoValor = n1 / n2;

        System.out.println("Ex:");
        System.out.println("Valor da divisão de " + n1 + " / " + n2 + " = " + divisaoValor);
        System.out.println("Sobra da divisão de " + n1 + " / " + n2 + " = " + divisaoSobra);

        // Cuidados com concatenação
        System.out.println(separacao);
        System.out.println("*Cuidados com a Concatenação*\n");
        
        String concatenar;

        concatenar =  1 + 1 + "1";
        System.out.println("Concatenando: 1 + 1 + \"1\" = "+concatenar);

        concatenar =  "1" + 1 + 1 ;
        System.out.println("Concatenando: \"1\" + 1 + 1 = " + concatenar);

        concatenar =  "1" + (1 + 1) ;
        System.out.println("Concatenando: \"1\"+ (1+1) = "+concatenar);

        // Cuidado com Unários
        System.out.println(separacao);
        System.out.println("Cuidado com unários\n");
        
        int n3 = 3;
        n3 = - n3;
        int n4 = n3 * -1;
        System.out.println(n3);
        System.out.println(n4);


        //Auto icremento ou decremento
        System.out.println(separacao);
        System.out.println("Auto Incremento ou Decremento\n");
        
        int numero1 = 5;
        System.out.println("Auto Incremento " + ++ numero1);
        // Isso é igual a numero = numero + 1
        System.out.println("Auto Decremento " + -- numero1);
        // Isso é igual a numero = numero - 1

        //Negação
        System.out.println(separacao);
        System.out.println("Trabalhando com negação de boleano\n");

        boolean verdadeiro = true;
        
        System.out.println("Valor real da variavel = true\n");
        System.out.println(verdadeiro);
        System.out.println(!verdadeiro);

        verdadeiro = !verdadeiro;
        System.out.println("\nValor real da variavel = false\n");
        System.out.println(verdadeiro);
        System.out.println(!verdadeiro);

        System.out.println(separacao);

    }
}
