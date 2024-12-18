/* ✏️  Actividad:Fibonacci
Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.

La serie de Fibonacci comienza de la siguiente manera:

Posición 0: 0

Posición 1: 1

Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)

Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)

Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)

Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3. */


public class Fibonnaci {

    public static void main(String[] args) {
        int n = 8; // número de términos a imprimir
        int cantidad = 0; // contador para el bucle
        int num1 = 0; // primer término de la serie
        int num2 = 1; // segundo término de la serie

        // Imprime los primeros dos términos de la serie
        System.out.print(num1 + ", " + num2);

        while (cantidad < n - 2) { // ya hemos impreso los primeros dos términos
            int num3 = num1 + num2; // siguiente término de la serie
            System.out.print(", " + num3);
            
            // Actualiza los valores para el siguiente ciclo
            num1 = num2;
            num2 = num3;
            cantidad++;
        }

    }
}