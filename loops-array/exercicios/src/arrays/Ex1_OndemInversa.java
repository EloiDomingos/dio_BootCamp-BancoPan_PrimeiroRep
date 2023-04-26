package arrays;

public class Ex1_OndemInversa {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        int contador = 0;

        System.out.print("Array: ");
        while (contador < array.length){
            System.out.print(array[contador] + " ");
            contador++;
        }

        System.out.print("\nArray: ");
        for(int i = array.length -1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
