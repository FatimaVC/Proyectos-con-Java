/* 1. Números primos plus

Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío es que desarrolles un programa que te solicite la cantidad deseada de números primos que deseas obtener.

Tu programa deberá generar y mostrar la cantidad de números primos que hayas solicitado. */

import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);
        

        // Se imprime un mensaje solicitando al usuario que introduzca la cantidad deseada de números primos
        System.out.print("Ingrese la cantidad deseada de números primos:  ");
        //  Se lee la entrada del usuario y se almacena en una variable llamada cantidad
        int cantidad = ejemplo.nextInt();
        int numero=2;
        int contador = 0;

        while (contador < cantidad) {
            boolean primo = true;
            for (int i = 2; i < numero; i++) { 
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if(primo){
                System.out.println("Los " + cantidad + " números primos son: " + numero) ;
                contador++;
            }
            numero++;
            ejemplo.close();
            
        }
    }
}
