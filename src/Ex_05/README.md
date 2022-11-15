## Ex_01
 - Creamos dos clases, una exception y la otra NegativeNumberException la cual hereda de la clase exception.
 - Luego con un throw creamos la excepcion para que luego con el constructor nos salte la excepción

## EX_03
- Lo primero que haremos serà crear un array de x tamaño, en nuestro caso de 4.


    //int[] arraysito;
    arraysito = new int[4];
- Y despues con un scanner y un bucle for vamos rellenando cada hueco del array con lo que escribamos.

       //System.out.println("Valor para posición del array ");
        Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 21; i++) {
                arraysito[i] = scanner.nextInt();
            }

- Y por ultimo haremos un catch para coger la excepcion llamada MaxLengthArr

       } catch (Exception MaxLengthArr) {

            System.out.println("Limite del array superado.");


## EX_04 

- Haremos un bucle while con una condicion que siempre se cumpla para que el bucle no termine.

      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  francisco= "guapo";

        while (francisco == "guapo"){
- Luego guardaremos el valor del scanner en una variable, y como es string y queremos ints,
  haremos un parseInt para pasar de String a Int.

      System.out.println("Introduzca numero ");
      String numero_string = scanner.nextLine();

                int numero = Integer.parseInt(numero_string);
- Luego crearemos otra variable para elevar al cuadrado y en esa variable guardaremos el valor de el numero * el numero.

       int elevado_cuadrado;

                elevado_cuadrado = numero * numero;

                System.out.println(elevado_cuadrado);

- Y por ultimo haremos el catch en el cual cogeremos la excepción de NumberFormatException y cuando esto pase pues que haga un print.

       } catch (NumberFormatException ime) {
                System.out.println("NumberFormat Exception: invalid input string");
## EX_05 excepcion NULL

- He creado una excepcion que basicamente para saber si una variable es null.
- En el try hago un if diciendo que si una variable es nula, usando el throw he creado la excepcion de cuando sea null.
- Y luego el catch para que cuando la excepcion ocurra acabe el programa y haga el print de la excepción.
- Y por ultimo el catch que es bastante opcional, que simplemente lo usaremos para hacer un print diciendo que esta la linea siempre se va a imprimir, podrias prescindir de este finnaly perfectamente.