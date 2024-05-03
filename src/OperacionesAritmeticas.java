
import java.lang.ArithmeticException;
/**
 * Clase para realizar operaciones aritméticas básicas.
 *
 * @since 1.0
 * @author William Zapata
 * @version 2.0
 */
public class OperacionesAritmeticas {

    /**
     * Realiza la suma de dos números
     *
     * @param a El primer número
     * @param b El segundo número
     * @return La suma de los dos números
     */
    public static double suma(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números
     *
     * @param a El número del cual se resta
     * @param b el número que se resta
     * @return La resta de los dos números
     */
    public static double resta(double a, double b) {
        return a - b;
    }
    /**
     * Realiza la multiplicación de dos números
     * @param a El primer número a multiplicar
     * @param b El segundo número a multiplicar
     * @return El resultado de la multiplicación
     */
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    /**
     * Realiza la división de dos números
     * @param a El dividendo
     * @param b El divisor
     * @return ArithmeticException si el divisor es cero
     */
    public static double division(double a, double b) throws ArithmeticException{
       if (b==0){
           throw new ArithmeticException("No se puede dividir por cero");
       }
        return a / b;
    }
}
