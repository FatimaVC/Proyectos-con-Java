/* ✏️  Actividad: Generando contraseñas
Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.

Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.

Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.

Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerandoContraseñas {
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);

        // Definimos los caracteres que pueden estar en la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // Creamos un objeto de la clase Random para generar números aleatorios
        Random random = new Random();
        // Solicitar la longitud de la contraseña
        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = ejemplo.nextInt();
        // Creamos un arreglo de caracteres para almacenar la contraseña
        char[] contrasena = new char[longitud];

        // Bandera para asegurarnos de que haya al menos una letra mayúscula, una
        // minúscula y un dígito
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        /*
         * Para generar la contraseña, utilizarás un bucle for que repetirá la operación
         * tantas veces como la longitud de la contraseña especificada por el usuario.
         */
        do {
            tieneMayuscula = false;
            tieneMinuscula = false;
            tieneDigito = false;

            for (int i = 0; i < longitud; i++) {
                // Obtenemos un índice aleatorio dentro del rango de caracteres
                int indice = random.nextInt(caracteres.length());
                // Agregamos el carácter correspondiente al arreglo de contraseña
                contrasena[i] = caracteres.charAt(indice);
                // Verificamos si el carácter es una letra mayúscula, minúscula o un dígito
                if (Character.isUpperCase(contrasena[i])) {
                    tieneMayuscula = true;
                } else if (Character.isLowerCase(contrasena[i])) {
                    tieneMinuscula = true;
                } else if (Character.isDigit(contrasena[i])) {
                    tieneDigito = true;
                }
            }
            // Para asegurarte de que la contraseña generada contenga al menos una letra
            // mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while
            // junto con los métodos isUpperCase, isLowerCase e isDigit de la clase
            // Character.

        } while(tieneMayuscula && tieneMinuscula || !tieneDigito );

        // Finalmente, convertirás el arreglo de caracteres en un String con un bucle
        // for y luego imprimirás la contraseña generada en la consola.

        System.out.println("La contraseña generada " + Arrays.toString(contrasena));

        ejemplo.close();

    }
}
