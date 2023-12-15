public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 26;

    public void definirCanal(int n){
        canal = n;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
