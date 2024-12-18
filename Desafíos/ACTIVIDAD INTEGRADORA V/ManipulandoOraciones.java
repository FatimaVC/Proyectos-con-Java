/* ✏️  Actividad: Manipulando oraciones 
Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:

Muestra un menú de opciones al usuario donde podrá:

Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).

Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.

Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.

Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".

Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.

Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).

Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.

Salir: Terminar el programa.

Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".

Realiza las validaciones que consideres necesarias. */

import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOraciones {

    public static void main(String[] args) {

        Scanner ejemplo = new Scanner(System.in);
        Scanner ejemplo1 = new Scanner(System.in);
        int opcion,cantidad,indice;
        String oracion = "";

        // Muestra un menú de opciones al usuario donde podrá:
        do {
            System.out.println("--Bienvenidx a mi menú--");
            System.out.println("-- OPCIONES--");
            System.out.println("--1. Crear o Borrar oración--");
            System.out.println("--2. Cantidad de caracteres--");
            System.out.println("--3. Cantidad de palabras");
            System.out.println("--4. Mostrar palabras ordenadas");
            System.out.println("--5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("--6. Buscar palabra dentro de la oración");
            System.out.println("--7. Modificar palabra dentro de la oración");
            System.out.println("--8. Agregar contenido de la oración");
            System.out.println("--9. Salir");

            // Se imprime un mensaje solicitando al usuario que introduzca un número
            System.out.print("Ingrese una opción: ");
            // Se lee la entrada del usuario y se almacena en una variable llamada opcion
            opcion = ejemplo.nextInt();

            switch (opcion) {
                case 1:
                    /* Crear oración o Borrar oración*/
                    if (oracion.isEmpty()) {
                        System.out.println("Crear una nueva oración: ");
                        oracion = ejemplo1.nextLine();
                    } else {
                        System.out.println("La oración ya está creada ¿Desea borrarla?: 1 para Si o 0 para No");
                        int respuesta = ejemplo.nextInt();
                        if (respuesta == 1) {
                            oracion = "";
                        } else {
                            System.out.println("Oración no eliminada");
                        }
                    }
                    break;
                case 2:
                    /*Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).*/
                    if (oracion.isEmpty()) {
                        System.out.println("Crea una nueva oración para poder calcular los caracteres que contiene");
                    } else {
                        cantidad = oracion.length();
                        System.out.println("La cantidad de carácteres de la oración es: " + cantidad);
                    }

                    break;
                case 3:
                    /*Cantidad de palabras de la oración: Calcular y mostrar la cantidad de
                    palabras en la oración.
                    */

                    /*Usar trim para eliminar espacios en blanco al principio y al final
                    oracion = oracion.trim();
                    */

                    // Verificar si la oración está vacía después de recortar
                    if (oracion.isEmpty()) {
                        System.out.println("La oración está vacía. No hay palabras para contar.");
                    } else {
                        /*Dividir la oración en palabras utilizando los espacios en blanco como
                         delimitadores. Para dividir la oración en palabras. El regex \\s+ se utiliza para dividir la cadena en base a uno o más espacios en blanco.
                         */
                        String[] palabras = oracion.split("\\s+");

                        // Mostrar la cantidad de palabras
                        System.out.println("La cantidad de palabras en la oración es: " + palabras.length);
                    }

                    break;
                case 4:

                    /* Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la
                    oración ordenadas alfabéticamente.*/
                    if (oracion.isEmpty()) {
                        System.out.println("Crea una nueva oración para poder calcular los caracteres que contiene");
                    } else {
                        String[] words = oracion.split("\\s+");
                        Arrays.sort(words);
                        System.out.println("Las palabras ordenadas alfabeticamente son:: " + Arrays.toString(words));
                    }

                    break;
                case 5:

                    /*Ingresar un número y devolver la palabra correspondiente*/

                    // Se imprime un mensaje solicitando al usuario que introduzca un número
                    System.out.print("Ingrese un número: ");
                    // Se lee la entrada del usuario y se almacena en una variable llamada opcion
                    indice = ejemplo.nextInt()-1;
                    if(indice > 0 || indice >= oracion.split(" ").length){// Verifica siel número ingresado es menor que 0 o mayor que la cantidad de palabras en la oración
                        System.out.println("Número inválido. Intente nuevamente");
                    } else {
                        System.out.println("La palabra correspondiente es: " +
                        oracion.split(" ")[indice]); // Si el número es válido, divide la oración en palabras y muestra la palabra en la posición indicada por el usuario
                    }
                    break;
                case 6:
                  /*Buscar palabra dentro de la oración*/
                  // Se imprime un mensaje solicitando al usuario ingresar una palabra 
                  System.out.print("Ingrese un palabra: ");
                  // Se lee la entrada del usuario y se almacena en una variable llamada opcion
                  String palabra = ejemplo1.nextLine();
                  //Verificar si esa palabra se encuentra en la oración.
                  if(oracion.contains(palabra)){
                    // Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.
                    System.out.println("La palabra fue encontrada en la posición:" + oracion.indexOf(palabra));
                  } else{
                    System.out.println("La palabra no fue encontrada");
                  }
                    break;
                case 7:
                // Modificar palabra dentro de la oración
                System.out.println("Ingresar la palabra que se quiere cambiar: ");
                String reemplazo = ejemplo.nextLine();
                if (!oracion.contains(reemplazo)) {
                    System.out.println("La palabra no fue encontrada");
                } else {
                    System.out.println("Ingresar una nueva palabra (o frase): ");
                    String nuevo = ejemplo.nextLine();
                    oracion = oracion.replace(reemplazo, nuevo);
                    System.out.println("La nueva oración modificada es: " + oracion);
                }
                    break;
                case 8:
                    // Agregar contenido a la oración:
                    System.out.println("Ingresar contenido: ");
                    String contenido = ejemplo.nextLine();
                    oracion += " " + contenido;
                    break;

                case 9:
                    System.out.println("Salir del programa");
                    break;
                default:
                    break;
            }

        } while (opcion != 9);
        ejemplo.close();
        ejemplo1.close();

    }
}
