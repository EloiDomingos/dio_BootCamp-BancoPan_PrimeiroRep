// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);

        System.out.println("TV está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV está ligada ? " + smartTv.ligada);
    }
}