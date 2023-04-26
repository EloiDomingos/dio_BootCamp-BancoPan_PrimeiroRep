package loops;

import java.util.Scanner;

public class Ex2_NotaEntreZeroEDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida ! Digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
