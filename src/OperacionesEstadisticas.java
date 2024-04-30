
import java.util.Arrays;

/**
 * Clase para realizar operaciones estadísticas básicas sobre un conjunto de
 * números
 * @since 1.0
 * @author William Zapata 
 * @version 2.0
 */
public class OperacionesEstadisticas {

    /**
     * Calcula la media aritmética de un conjunto de números
     *
     * @param numeros El conjunto de números
     * @return La media aritmética de los números
     */
    public static double media(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    /**
     * Calcula la mediana de un conjunto de números
     *
     * @param numeros El conjunto de números
     * @return La mediana de los números
     */
    public static double mediana(double[] numeros) {
        Arrays.sort(numeros);//Ordena los números en orden ascendente
        int n = numeros.length;
        if (n % 2 == 0) { //Si la cantidad de números es par
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;//La mediana es el promedio de los números centrales
        } else {//Si la cantidad de números es impar
            return numeros[n / 2];//la mediana es el número central
        }
    }
}
