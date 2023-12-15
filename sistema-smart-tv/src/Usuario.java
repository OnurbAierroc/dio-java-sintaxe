public class Usuario {
    public static void main(String[] args) throws Exception {
        
        //SmartTV é um classe
        String separacao = "===================================";

        SmartTv smartTv = new SmartTv();
        int canalNovo = 10;

        System.out.println(separacao);
        System.out.println("Estado Inicial da TV\n");
        System.out.println("Tv esta ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        System.out.println(separacao);
        System.out.println("Novos Status da TV\n");
        smartTv.ligar();
        System.out.println("Tv esta ligada (Novo Status): " + smartTv.ligada);
       
        smartTv.desligar();
        System.out.println("Tv esta ligada (Novo Status): " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.definirCanal(canalNovo);
        System.out.println("Canal atual: " + smartTv.canal);

    }   
}
