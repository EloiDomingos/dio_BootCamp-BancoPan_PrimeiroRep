import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        System.out.println("Adicione as notas: ");

        notas.add(8.0);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(8.0);
        notas.add(10.0);
        notas.add(6.0);
        notas.add(8.0);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 6.0: " + notas.indexOf(6.0));

        System.out.println("Adicione na lista a nota 5.0 na posição 4: ");
        notas.add(4, 5.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 6.0 pela nota 7.0: ");
        notas.set(notas.indexOf(6.0), 7.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 10.0 esta na lista: " + notas.contains(10.0));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a soma das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 5.0: ");
        notas.remove(5.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        notas.add(4, 6.6);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        /*System.out.println("Apagar toda a lista");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}