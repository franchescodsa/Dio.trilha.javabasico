public class ExSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentado o volume ");
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume: ");
    }

    public void aumentarDeCanal() {
        canal++;
    }

    public void diminuirDeCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }


    public static void main(String[] args) throws Exception {
        ExSmartTv smartTv = new ExSmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.ligada);

        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("NOvo status -> TV LIGADA " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("NOvo status -> TV LIGADA " + smartTv.ligada);

        //System.out.println("Aumentar volume: " + smartTv.volume);
    }
}

