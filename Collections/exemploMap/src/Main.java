import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos valores");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.0);
           put("Focus", 10.5);
           put("Fox", 11.0);
           put("Jetta", 14.0);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson esta presente: "
                + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do Focus: " + carrosPopulares.get("Focus"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o carro mais economico e seu consumo: ");

        Double consumoMelhor = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMelhor)) modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Carro mais eficiente " + modeloMaisEficiente + " - " + consumoMelhor);

        System.out.println("Exiba o carro menos economico e seu consumo: ");

        Double consumoMenor = Collections.min(carrosPopulares.values());
        String ModeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenor)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Carro menos eficiente: " + modeloMaisEficiente + " - " + consumoMenor);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Soma dos Consumos: " + soma);

        System.out.println("Exiba a média dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os carros com consumo 15.2 km/l ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.2)) iterator1.remove();
        }

        System.out.println(carrosPopulares);

    }
}