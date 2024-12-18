import java.util.Scanner;

public class ConversionDeTemperaturas {
    public static void main(String[] args) {
        // 1. Solicita al usuario ingresar una temperatura y una unidad de medida:
        // Celsius (C) o Fahrenheit (F).

        Scanner ejemplo = new Scanner(System.in);

        System.out.println("Ingresa la temperatura: ");
        double temperatura = ejemplo.nextDouble();

        System.out.println("Ingrese la unidad de medida (C/F): ");
        char medida = ejemplo.next().charAt(0);

        // 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado
        // en pantalla.
        double resultado;

        if (medida == 'C') {
            resultado = 9 / 5. * temperatura + 32;
            System.out.println("La temperatura en Fahrenheit es: " + resultado + "°F");
        } else if (medida == 'F') {
            resultado = temperatura - 32 * 5 / 9;
            System.out.println("La temperatura en Celsius es: " + resultado + "°C");
        } else {
            System.out.println("Unidad de medida no válida. Por favor, ingrese 'C' o 'F'.");
        }

        ejemplo.close();
    }

}