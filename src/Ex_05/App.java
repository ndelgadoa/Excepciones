package Ex_05;
import java.util.InputMismatchException;
import java.util.Scanner;

            public class App
            {
                public static void main(String[] args) {
                    String nombre = null;
                    try {

                        if (nombre == null) {
                            throw new NullPointerException("La variable es nula");
                        }}catch(NullPointerException ex){
                            System.out.println("Error" + ex);
                        }finally {
                            System.out.println("Esta linea se va a imprimir");
                        }

                }
                }

