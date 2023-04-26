package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int contador = 0;

        do{
            System.out.println("Letra: ");
            String letra = scanner.next();

            if( !(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador] = letra;
                quantConsoantes++;
            }

            contador++;

        } while (contador < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante: consoantes) {
            if(consoante != null) System.out.print(consoante + " ");
        }

    }
}
