package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros, numero;
        int contador = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Digite a quantidade de números para serem analisados: ");
        quantNumeros = scanner.nextInt();

        do{
            System.out.println("Digite o número: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0) quantPares = quantPares + 1;
            else quantImpares = quantImpares + 1;

            contador = contador + 1;
        } while (contador < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);
    }
}
