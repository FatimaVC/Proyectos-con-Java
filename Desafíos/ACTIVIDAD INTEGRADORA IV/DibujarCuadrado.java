/* 2. Dibujando cuadrados

Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.

Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 

Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente

 */

import java.util.Scanner;

public class DibujarCuadrado {
 
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);

        // Se imprime un mensaje solicitando al usuario que introduzca la cantidad deseada de lados
        System.out.print("Ingrese el número de lados del cuadrado que desea dibujar:  ");
        //  Se lee la entrada del usuario y se almacena en una variable llamada cantidad
        int contlados = ejemplo.nextInt();

        //Dibujar cuadrado
        for (int i = 0; i < contlados; i++) {
            // Dibujar una línea de asteriscos
            for (int j = 0; j < contlados; j++) {
                System.out.print("* ");
            }
            // Cambiar de línea después de dibujar cada línea del cuadrado
            System.out.println();
        }

        ejemplo.close();
    }
 }

