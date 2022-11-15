package Ex_03;
import java.util.Scanner;
import java.lang.reflect.Array;


public class App {

    public static void main(String[] args) {

        int[] arraysito;
        arraysito = new int[4];

        try {
            System.out.println("Valor para posición del array ");
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 21; i++) {
                arraysito[i] = scanner.nextInt();
            }

        } catch (Exception MaxLengthArr) {

            System.out.println("Limite del array superado.");


        }
    }
}

