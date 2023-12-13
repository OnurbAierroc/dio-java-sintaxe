public class Condicional {
    public static void main(String [] args){
        
        String separacao = "============================================";
        System.out.println(separacao);
        System.out.println("CONDICIONAIS");
        System.out.println(separacao);
        
        System.out.println("Condicional Ternário -- Estrutura em uma única linha\n");
        int a = 6;
        int b = 6;
        
        String resultadoString = a==b ? "verdadeiro" : "falso"; // condicional ternario
        System.out.println("int bala = a==b ? \"verdadeiro\" : \"falso\"");
        int resultadoInt = a==b ? 1 : 0;

        System.out.println(resultadoString);
        System.out.println(resultadoInt);

        System.out.println(separacao);
        System.out.println("Condional IF ELSE");
        String resultado;      
        //Outra condicional
        
        if (a == b){
            resultado = "a = b";
        }
        if(a > b){
            resultado = "a > b";
        }
        else
        {
            resultado = "a < b";
        }
        System.out.println(resultado);


    }
    
}
