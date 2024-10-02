import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Arreglo de tamaño 20 para almacenar los números
        int[] numeros = new int[20];
        Scanner arreglo = new Scanner(System.in);

        System.out.println("Por favor, introduce 20 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = arreglo.nextInt();
        }

        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}

