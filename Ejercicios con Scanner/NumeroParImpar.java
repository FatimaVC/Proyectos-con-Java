import java.util.Scanner;

public class NumeroParImpar {

    public static void main(String[]args){
        
         Scanner numeros = new Scanner(System.in);

         //Solicita al usuario que ingrese un número y almacena este valor en una variable.
         System.out.println("Ingrese un número: ");
         int num = numeros.nextInt();

         //Desarrolla un programa que determine si el número ingresado es par o impar.
         String parImpar = (num % 2 == 0) ? "par" : "impar";

         //Muestra el resultado en la consola.
         System.out.println("El número es " + parImpar);

         numeros.close();
    }
}