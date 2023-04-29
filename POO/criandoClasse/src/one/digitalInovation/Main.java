package one.digitalInovation;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("prata");
        carro1.setModelo("Focus");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.49));

        Carro carro2 = new Carro("prata", "Fox", 50);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.49));
    }
}
