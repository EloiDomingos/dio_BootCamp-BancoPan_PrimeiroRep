package com.queue;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Audi")));
        System.out.println(queueCarros);


        System.out.println(queueCarros.offer(new Carro("Jeep"))); //Igual o método add mas retorna false caso não consiga executar a função
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());//pega o primeiro elemento da fila, se tiver vazia, retorna nulo.
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());//ele remove o primeiro elemento da lista
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());
    }
}
