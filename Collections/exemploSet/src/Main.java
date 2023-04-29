import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.5, 5d, 7d, 1d, 3.5));
       System.out.println(notas);

        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 1: ");
        notas.remove(1d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(8d);
        notas2.add(9d);
        notas2.add(10d);
        notas2.add(7d);
        notas2.add(6.5);
        notas2.add(5.5);
        notas2.add(4d);

        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio: " + notas2.isEmpty());
    }
}