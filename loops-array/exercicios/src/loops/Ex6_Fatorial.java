package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        int mult = 1;

        System.out.println("Fatorial: ");
        fatorial = scanner.nextInt();

        for(int i = fatorial; i >= 1; i--){
            mult = mult * i;
        }

        System.out.println("O fatorial de " +fatorial + " " + "é" + " " + mult);
    }
}
