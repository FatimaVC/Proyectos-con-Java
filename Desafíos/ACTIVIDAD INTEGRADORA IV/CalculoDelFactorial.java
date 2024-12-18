
/* ✏️  Actividad: Cálculo del factorial
El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar un número y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, te presentamos  algunos ejemplos para mayor claridad:

El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.

El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.

Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040.
 */

import java.util.Scanner;

public class CalculoDelFactorial {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);
        int numero;
        double factorial = 1;

         // Se imprime un mensaje solicitando al usuario que introduzca un número
         System.out.print("Ingrese un nùmero: ");
         //  Se lee la entrada del usuario y se almacena en una variable llamada numero
         numero = ejemplo.nextInt();

        do {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }
        } while (numero < 0);

        // mostrar el resultado
        System.out.printf("%d! = %.0f %n", numero, factorial);

        ejemplo.close();
    }
}