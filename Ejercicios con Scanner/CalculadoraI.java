import java.util.Scanner;

public class CalculadoraI {
    public static void main(String[]args){
      Scanner calcular = new Scanner(System.in);
      //Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
      System.out.println("Ingrese el primer número: ");
      int num1 = calcular.nextInt();
      System.out.println("Ingrese el segundo número: ");
      int num2 = calcular.nextInt();

      System.out.println("--Bienvenidx a mi calculadora--");
      System.out.println("-- OPCIONES--");
      System.out.println("--1. Suma--");
      System.out.println("--2. Resta--");
      System.out.println("--3. Multiplicación");
      System.out.println("--4. División");
      System.out.println("--5. Salir");

      System.out.println("Por favor selecciona una opción: ");
      int opcion = calcular.nextInt();

      switch (opcion) {
        case 1:
            System.out.println("El resultado es: "+(num1+num2));
            break;
        case 2:
            System.out.println("El resultado es: "+(num1-num2));
            break;
        case 3:
            System.out.println("El resultado es: "+(num1*num2));
            break;
        case 4:
            System.out.println("El resultado es: "+(num1/num2));
            break;
        default:
            System.out.println("Ingrese un número entre 1 y 4");
            break;
    }
    calcular.close();
    }
}
