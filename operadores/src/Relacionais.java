public class Relacionais {
    public static void main (String []args){

        String separacao = "=======================";

        System.out.println(separacao);
        System.out.println("Relacionais\n");
        System.out.println("== igual");
        System.out.println("!= difenrente");
        System.out.println("> maior que");
        System.out.println("< menor que");
        System.out.println(">= maior ou igual");
        System.out.println("<= menor ou igual");

        System.out.println(separacao);
        System.out.println("Comparação entre VARIVEIS e OBJETOS\n");

        String nomeUm = "Bruno";
        String nomeDois = "Bruno";

        System.out.println("Comparando variaveis com boolean");
        System.out.println(nomeUm == nomeDois); // retorno true

        String nome1 = "Teste";
        String nome2 = new String ("Teste");

        System.out.println("\nComparando Objetos com Boolean");
        System.out.println(nome1 == nome2); // retorno falso pois Java não consegue comparar 2 objetos dessa maneira
        System.out.println("Comparando Objetos com equals 'FORMA CORRETA'");
        System.out.println(nome1.equals(nome2));

        System.out.println(separacao);

        System.out.println("CONDIÇÕES RELACIONAIS\n");
        System.out.println("&& = E");
        System.out.println("|| OU\n");

        int n1 = 2;
        int n2 = 3;
        int n3 = 4;

        if (n1 < n2 && n1 <n3){
            System.out.println(n1 + " é menor que " + n2 + " e "+ n3);
        }

        if (n1 > 2 || n3 > 2){
            System.out.println("\nUma das condições foi atingida");
        }
    }
}
