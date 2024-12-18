/* ✏️  Actividad: Números primos
Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).

Un número es primo si solo tiene dos divisores: 1 y él mismo.  */

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);
        int numero;

          do{
             
             System.out.print("Ingrese un número: ");
             numero= ejemplo.nextInt();
            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
             }
            boolean primo = true;
            for (int i = 2; i < numero; i++) { 
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if(primo){
                System.out.println("El número es primo. ");
            }else{
                System.out.println("No es primo; Ingrese otro número , por favor");
            }
            
          }while(numero != 0);
          ejemplo.close();

    }
}