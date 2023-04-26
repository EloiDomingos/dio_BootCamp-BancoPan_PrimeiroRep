package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada;

        System.out.println("Qual tabuada deseja ver ? ");
        tabuada = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + "x" + i + " = " + (tabuada*i));
        }
    }
}
