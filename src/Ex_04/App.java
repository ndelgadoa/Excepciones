package Ex_04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  francisco= "guapo";

        while (francisco == "guapo"){
            try {
                System.out.println("Introduzca numero ");
                String numero_string = scanner.nextLine();

                int numero = Integer.parseInt(numero_string);
                int elevado_cuadrado;

                elevado_cuadrado = numero * numero;

                System.out.println(elevado_cuadrado);


            } catch (NumberFormatException ime) {
                System.out.println("NumberFormat Exception: invalid input string");

            }

        }
    }
}




