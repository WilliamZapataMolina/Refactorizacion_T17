
import java.util.Scanner;

/**
 * Clase principal que permite al usuario realizar diversas operaciones
 * aritméticas y estadísticas
 *
 * @author William Zapata versión 2.0
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mostrar las opciones disponibles al usuario
        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Media");
        System.out.println("6. Mediana");

        //Leer la opción ingresada por el usuario
        int aux = scanner.nextInt();
        //Realizar la operación seleccionada por el usuario
        switch (aux) {
            case 1:
                //Realizar la suma
                System.out.println("Ingrese dos números para sumar:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                System.out.println("El resultado de la suma es: " + OperacionesAritmeticas.suma(num1, num2));
                break;
            case 2:
                //Realizar la resta
                System.out.println("Ingrese dos números para restar:");
                double num3 = scanner.nextDouble();
                double num4 = scanner.nextDouble();
                System.out.println("El resultado de la resta es: " + OperacionesAritmeticas.resta(num3, num4));
                break;
            case 3:
                //Realizar la resta
                System.out.println("Ingrese dos números para multiplicar:");
                double num5 = scanner.nextDouble();
                double num6 = scanner.nextDouble();
                System.out.println("El resultado de la multiplicación es: " + OperacionesAritmeticas.multiplicacion(num5, num6));
                break;
            case 4:
                //Realizar la resta
                System.out.println("Ingrese dos números para dividir:");
                double num7 = scanner.nextDouble();
                double num8 = scanner.nextDouble();
                System.out.println("El resultado de la multiplicación es: " + OperacionesAritmeticas.division(num7, num8));
                break;
            case 5:
                //Realizar la media
                System.out.println("Ingrese los números para calcular la media:");
                int cantidad = scanner.nextInt();
                double[] numeros = new double[cantidad];

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numeros[i] = scanner.nextDouble();
                }

                System.out.println("La media de los números ingresados es: " + OperacionesEstadisticas.media(numeros));
                break;
            case 6:
                //Calcular la mediana
                System.out.println("Ingrese los números para calcular la mediana:");
                int cantidad1 = scanner.nextInt();
                double[] numeros1 = new double[cantidad1];

                for (int i = 0; i < cantidad1; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numeros1[i] = scanner.nextDouble();

                }
                System.out.println("La mediana de los números ingresados es: " + OperacionesEstadisticas.mediana(numeros1));
                break;

        }
        scanner.close();
    }

}
//            case 3:
//                System.out.println("Ingrese los números para calcular la media (separados por espacios):");
//                double[] numeros = new double[5];
//                for (int i = 0; i < 5; i++) {
//                    numeros[i] = scanner.nextDouble();
//                }
//                System.out.println("La media de los números ingresados es: " + OperacionesEstadisticas.media(numeros));
//                break;
//            case 4:
//                System.out.println("Ingrese los números para calcular la mediana (separados por espacios):");
//                double[] nums = new double[5];
//                for (int i = 0; i < 5; i++) {
//                    nums[i] = scanner.nextDouble();
//                }
//                System.out.println("La mediana de los números ingresados es: " + OperacionesEstadisticas.mediana(nums));
//                break;

