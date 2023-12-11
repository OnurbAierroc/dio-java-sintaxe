public class TIposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        // Java fortemente tipado, não tem como transformar uma variavel em outro tipo de variavel, se for menor.

        String separacao = "==============================\n";
        System.out.println(separacao);
        System.out.println("Tipos de variaveis");
        System.out.println(separacao);
              
        short numeroCurto = 1;
        int numeroInt = numeroCurto;
        short numeroCurto2 = (short)numeroInt; //cast só assim para permitir

        final double VALORPI = 3.14;

        System.out.println ("Estrutura Variavel");
        System.out.println ("<tipo> <nomeVarivel> <atribuirValorOpcicional>\n"); //Nome começa com minúsculo e nome composto com as segunites palavras com inical maisculo
        System.out.println ("Estrutura CONSTANTE");
        System.out.println ("<final> <tipo> <NOMECONSTANTE> <atribuirValorOpcicional>"); //NOME EM CAIXA ALTA
        System.out.println(separacao);

        System.out.println ("Numeros Inteiros");
        System.out.println ("byte = 1byte");
        System.out.println ("short = 2byte");
        System.out.println ("int = 4bytes");
        System.out.println ("long = 8bytes -- Tem de colocar o L no final");
        System.out.println(separacao);

        System.out.println ("Numeros Não Inteiros");
        System.out.println ("float = 4bytes -- Tem de colocar o F no final");
        System.out.println ("double = 8bytes -- usar . para separação decimal");
        System.out.println(separacao);

        System.out.println ("CONSTANTES");
        System.out.println ("Inserir final no começo da sinxtaxe");
        System.out.println(separacao);

        System.out.println ("EXMEPLOS\n");
        System.out.println("Valor de PI: "+VALORPI);
        System.out.println("Realização de Cast: "+numeroCurto2);

        System.out.println("\n");
    }
}
