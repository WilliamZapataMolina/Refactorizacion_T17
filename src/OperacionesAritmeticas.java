
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
     * @param a El primer número
     * @param b El segundo número
     * @return La multiplicación de los dos números
     */

    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    /**
     * 
     * @param a El dividendo
     * @param b El divisor
     * @return El cociente de la división de a entre b
     * @throws ArithmeticException si el divisor (b) es 0
     */

    public static double division(double a, double b) {
        return a / b;
    }
}
