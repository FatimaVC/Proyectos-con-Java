/* 3. Creando un gráfico de barras:

Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, donde cada asterisco representa una unidad en la escala. A modo de ejemplo: */

import java.util.Scanner;

public class GraficoDeBarras {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);
        int[] numeros = new int[4];

        // Solicitar al usuario que ingrese 4 números entre 1 y 20
        for (int i = 0; i < 4; i++) {
            int numero;
            do {
                System.out.print("Ingrese un número entre 1 y 20 para la posición " + (i + 1) + ": ");
                numero = ejemplo.nextInt();
            } while (numero < 1 || numero > 20);
            numeros[i] = numero;;
        }
        

        // Imprimir la representación visual en forma de gráfico de barras
        System.out.println("\nGráfico de barras:");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ejemplo.close();

    }
}