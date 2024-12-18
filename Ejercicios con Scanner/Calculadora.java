import java.util.Scanner;

public class Calculadora {
    static Scanner calculadora = new Scanner(System.in);
    public static void main (String[]args){

        /* //Solicita al usuario que ingrese un número y almacena este valor en una variable.
        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt(); */

        System.out.println("--Bienvenidx a mi calculadora--");
        System.out.println("-- OPCIONES--");
        System.out.println("--1. Suma--");
        System.out.println("--2. Resta--");
        System.out.println("--3. Multiplicación");
        System.out.println("--4. División");
        System.out.println("--5. Salir");

        System.out.println("Por favor selecciona una opción: ");
        int opcion = calculadora.nextInt();

        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Ingrese un número entre 1 y 4");
                break;
        }
        calculadora.close();
    }

    static void suma(){
        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt();
        int resultado = num1+num2;
        System.out.println("El resultado de la suma es: "+ resultado);
    }
    static void resta(){
        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt();
        int resultado = num1-num2;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    static void multiplicacion(){
        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt();
        int resultado = num1*num2;
        System.out.println("El resultado es: "+ resultado);
    }
    static void division(){
        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt();
        int resultado = num1 / num2;
        System.out.println("El resultado es: "+ resultado);
    }
}
