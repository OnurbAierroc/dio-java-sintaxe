public class Documentacao {

    /**
     * Aqui posso inserir os:
     * Parametros
     * Exeçoes
     * E outras informações da minha classe / método
     * @param Main
     * @throws Ta_bala
     */

    public static void main(String[] args) throws Exception {
       
        String separacao = "=================================";
        System.out.println(separacao);
        System.out.println("Java-doc -- Documentação");
        System.out.println("Maneiras de Documentar o meu Código\n");


        /*Assim podemos comentar múltiplas linhas */
        System.out.println("/* Comentário  */");
        
        System.out.println("/** Documentação  fora do meu método*/");

        System.out.println(separacao);
        System.out.println("\nComando que documenta todo o meu Arquivo em .html\n");
        System.out.println("javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java\n");
        System.out.println("Atenção para com a pasta que você esta no moemnto para a geração desse arquivo");
        System.out.println("Pode ocasionar erro ao não encontrar o arquivo .java");
        System.out.println("É criado uma pasta Docs, na raiz (../docs) -- Voltou uma pasta e criou o diretório docs");

    }
}
