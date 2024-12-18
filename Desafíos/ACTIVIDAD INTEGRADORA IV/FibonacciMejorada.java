/* En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.

Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:

Posición 0: 0

Posición 1: 1

Posición 2: 1

Posición 3: 2

Posición 4: 3 */

import java.util.Scanner;

public class FibonacciMejorada {
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);
        int resultado;

        // Se imprime un mensaje solicitando al usuario que introduzca un número
        System.out.print("Ingrese la posición en la serie de Fibonacci: ");
        //  Se lee la entrada del usuario y se almacena en una variable llamada numero
        int numero = ejemplo.nextInt();

        // Si n es 0, se retorna 0, ya que el primer número de la serie de Fibonacci es 0.
        if (numero == 0) {
            resultado = 0;
        // Si n es 1, se retorna 1, ya que el segundo número de la serie de Fibonacci es 1.
        } else if (numero == 1) {
            resultado = 1;
        } else {
            int a = 0, b = 1, c;
            for (int i = 2; i <= numero; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            resultado = b;

        }
        //Mostrar en consola
        System.out.println("El número en la posición " + numero + " de la serie de Fibonacci es: " + resultado);
        
        ejemplo.close();
    }
}
