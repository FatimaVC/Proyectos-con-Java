/* ✏️  Actividad: Estadísticas de calificaciones
Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.

Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.

Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por último, imprimiré los resultados en consola. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner ejemplo = new Scanner(System.in);

        // Creamos un objeto de la clase Random para generar números aleatorios
        Random random = new Random();
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidad = ejemplo.nextInt();
        // Creamos un arreglo de string para almacenar las calificaciones
        String[] calificaciones = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int calificacion = random.nextInt(101); // Generar un número aleatorio entre 1 y 100
            calificaciones[i] = String.valueOf(calificacion); // Convertir el número a String y almacenarlo en el arreglo
            // Genera números aleatorios del 1 al 20
            // calificaciones[i] = String.valueOf(random.nextInt(20) + 1);
        }
        
        /* El programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo. */

        // Contadores para cada tipo de calificación
        int countDesaprobados = 0;
        int countAprobados = 0;
        int countExcelentes = 0;
        
        // Arreglos para almacenar las calificaciones separadas
        double[] desaprobados = new double[calificaciones.length];
        double[] aprobados = new double[calificaciones.length];
        double[] excelentes = new double[calificaciones.length];

        // Convertir calificaciones a double y clasificarlas
        for (String calificacionStr : calificaciones) {
            double calificacion = Double.parseDouble(calificacionStr);
            if (calificacion < 4) {
                desaprobados[countDesaprobados++] = calificacion;
            } else if (calificacion >= 10) {
                excelentes[countExcelentes++] = calificacion;
            } else {
                aprobados[countAprobados++] = calificacion;
            }
        }
        
        // Mostrar las calificaciones generadas
        System.out.println("----------CALIFICACIONES GENERADAS----------");
        System.out.println("Calificaciones generadas: " + Arrays.toString(calificaciones));
        System.out.println("Desaprobados: " + Arrays.toString(Arrays.copyOf(desaprobados, countDesaprobados)));
        System.out.println("Aprobados: " + Arrays.toString(Arrays.copyOf(aprobados, countAprobados)));
        System.out.println("Excelentes: " + Arrays.toString(Arrays.copyOf(excelentes, countExcelentes)));
        System.out.println("\n");

        // Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.
        double suma = 0;
        double sumaDesaprobados = 0;
        double sumaAprobados = 0;
        double sumaExcelentes = 0;
         
      /*  for(int i = 0; i< calificaciones.length;i++){
           sumaDesaprobados += desaprobados[i];
           sumaAprobados += aprobados[i];
           sumaExcelentes += excelentes[i];
        }  */
        for (String calificacionStr : calificaciones) {
            suma += Double.parseDouble(calificacionStr);
        }
        for (int i = 0; i < countDesaprobados; i++) {
            sumaDesaprobados += desaprobados[i];
        }
        for (int i = 0; i < countAprobados; i++) {
            sumaAprobados += aprobados[i];
        }
        for (int i = 0; i < countExcelentes; i++) {
            sumaExcelentes += excelentes[i];
        }


        double promedio = suma / calificaciones.length;
        double promedioDesaprobados = countDesaprobados > 0 ? sumaDesaprobados / countDesaprobados : 0;
        double promedioAprobados = countAprobados > 0 ? sumaAprobados / countAprobados : 0;
        double promedioExcelentes = countExcelentes > 0 ? sumaExcelentes / countExcelentes : 0;
         /* double promedioDesaprobados;
        double promedioAprobados;
        double promedioExcelentes; */

         /* promedioDesaprobados = sumaDesaprobados / calificaciones.length;
        promedioAprobados = sumaAprobados / calificaciones.length;
        promedioExcelentes = sumaExcelentes / calificaciones.length; */


        System.out.println("--------------------------PROMEDIOS--------------------------------");
        System.out.println("El promedio de calificaciones generales: "+ promedio);
        System.out.println("El promedio de calificaciones de desaprobados: "+ promedioDesaprobados);
        System.out.println("El promedio de calificaciones de aprobados: "+ promedioAprobados);
        System.out.println("El promedio de calificaciones de excelentes: "+ promedioExcelentes);

    ejemplo.close();
        
    }

    
}