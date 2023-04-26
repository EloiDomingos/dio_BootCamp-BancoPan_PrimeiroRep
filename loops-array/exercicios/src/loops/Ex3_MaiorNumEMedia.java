package loops;

import java.util.Scanner;

public class Ex3_MaiorNumEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int i = 0;
        int media = 0;

        do{
            System.out.println("Digite o número: ");
            numero = scanner.nextInt();

            media = media + numero;

            if(numero > maiorNumero) maiorNumero = numero;

            i = i + 1;
        } while (i < 5);

        System.out.println("O maior número digitado é: " + maiorNumero);
        System.out.println("Média calculada: " + (media/5));
    }
}
