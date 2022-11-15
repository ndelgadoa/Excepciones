package Ex_01;

public class Exception {

    public static void main(String[] args) throws NegativeNumberException{
        throw new NegativeNumberException("Error fatal ");
    }
}
