import java.util.Scanner;

public class ValidacionContraseña {
    // Escribe un programa que solicite al usuario que ingrese una contraseña y
    // verifique si cumple con los siguientes criterios para considerarse segura:
    public static void main(String[] args) {
        Scanner ejemplo = new Scanner(System.in);
        // La contraseña debe tener al menos 8 caracteres.
        System.out.println("Ingrese su contraseña: ");
        String contraseña = ejemplo.nextLine();

        /*
         * // contraseña.length();
         * System.out.println("La contraseña tiene: " + contraseña.length() +
         * " caracteres");
         */

        if (contraseña.length() >= 8) {
            System.out.println("Su contraseña es segura. ");
        } else {
            System.out.println("Su contraseña no es segura. ");
        }

        // La contraseña debe contener al menos una letra mayúscula y una letra
        // minúscula.
        boolean valMayuscula = false;
        boolean valMiniscula = false;
        // La contraseña debe contener al menos un número.
        boolean valNumero = false;
        // La contraseña debe contener al menos un carácter especial (por ejemplo, !, @,
        // #, $).
        boolean valCaracter = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                valMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                valMiniscula = true;
            } else if (Character.isDigit(caracter)) {
                valNumero = true;
            } else {
                valCaracter = true;
            }
        }
        StringBuilder mensajeError = new StringBuilder("Contraseña no segura. Debe tener: ");
        if (!valMayuscula) {
            mensajeError.append("al menos una letra mayúscula, ");
        }
        if (!valMiniscula) {
            mensajeError.append("al menos una letra minúscula, ");
        }
        if (!valNumero) {
            mensajeError.append("al menos un número, ");
        }
        if (!valCaracter) {
            mensajeError.append("al menos un carácter especial, ");
        }
        if (contraseña.length() > 8 && valCaracter && valMayuscula && valMiniscula && valNumero) {
            System.out.println("Contraseña segura!");
        } else {
            System.out.println(mensajeError.substring(0, mensajeError.length() - 2));
        }

        ejemplo.close();
    }
    // El programa debe mostrar un mensaje indicando si la contraseña es segura o
    // no, según los criterios establecidos. Puedes utilizar métodos de la clase
    // String para verificar cada uno de los criterios.
}
