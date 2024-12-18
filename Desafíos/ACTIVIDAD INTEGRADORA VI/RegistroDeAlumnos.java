import java.util.Scanner;

public class RegistroDeAlumnos {

    public static void main(String[] args) {
        Scanner ejemplo = new Scanner(System.in);
        Scanner ejemplo1 = new Scanner(System.in);

        int opcion;
        int suma = 0;
        double promedio;
        String[] nombresAlumnos = new String[5];
        double[] notas = new double[5];

        do {
            System.out.println("--REGISTRO DE ALUMNOS--");
            System.out.println("-------------OPCIONES-----------");
            System.out.println("--1. Registrar alummno--");
            System.out.println("--2. Mostrar todos los alumnos--");
            System.out.println("--3. Mostrar promedio de notas");
            System.out.println("--4. Buscar alumno por nombre");
            System.out.println("--5. Modificar nota por nombre:");
            System.out.println("--6. Eliminar alumno por nombre");
            System.out.println("--7. Salir");

            // Se imprime un mensaje solicitando al usuario que introduzca un número
            System.out.print("Ingrese una opción: ");
            // Se lee la entrada del usuario y se almacena en una variable llamada opcion
            opcion = ejemplo.nextInt();

            switch (opcion) {
                case 1:
                    // Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su
                    // nombre y nota.
                    for (int i = 0; i < nombresAlumnos.length; i++) {// Recorremos el array de nombres
                        // Para cada alumno, se pide primero el nombre y luego la nota.
                        System.out.println("Ingrese nombre de alumno: ");
                        nombresAlumnos[i] = ejemplo1.nextLine();
                        System.out.println("Ingrese nota de alumno: ");
                        notas[i] = ejemplo.nextDouble();
                        while (true) {
                            // Se asegura que la nota sea un número válido.
                            try {
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Nota no válida. Por favor ingrese un número.");
                            }
                        }
                    }
                    break;

                case 2:
                    // Mostrar todos los alumnos:
                    System.out.println("Lista de alumnos registrados:");
                    for (int i = 0; i < nombresAlumnos.length; i++) {// Recorremos el array de nombres
                        // Mostrar en pantalla el nombre y la nota de todos los alumnos registrados
                        // hasta el momento
                        System.out.println("Alumno: " + nombresAlumnos[i] + ", Nota: " + notas[i]);
                    }

                    break;

                case 3:
                    // Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las
                    // notas de todos los alumnos registrados hasta el momento.
                    for (int i = 0; i < notas.length; i++) { // Recorremos el array de notas
                        suma += notas[i]; // Sumamos cada nota a la suma
                    }
                    // Calculamos el promedio dividiendo la suma entre el número de nota
                    promedio = (double) suma / notas.length;
                    // System.out.println("La suma de los elementos del array es: "+suma);
                    // mostrar en pantalla el promedio de las notas de todos los alumnos registrados
                    // hasta el momento.
                    System.out.println("El promedio de las notas de todos los alumnos es: " + promedio);

                    break;

                case 4:
                    // Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un
                    // alumno y mostrar en pantalla su nota si el alumno existe.
                    // Se imprime un mensaje solicitando al usuario ingresar el nombre que desea
                    // buscar
                    System.out.print("Ingrese un nombre: ");
                    // Se lee la entrada del usuario y se almacena en una variable llamada opcion
                    String nombreBusqueda = ejemplo1.nextLine();
                    boolean encontrado = false; // Creamos una variable para saber si hemos encontrado al alumno
                    for (int i = 0; i < nombresAlumnos.length; i++) { // Recorremos el array de nombres
                        if (nombresAlumnos[i].equals(nombreBusqueda)) { // Si encontramos al alumno
                            System.out.println("Nombre: " + nombresAlumnos[i] + ", Nota: " +
                                    notas[i]); // Mostramos su nombre y nota
                            encontrado = true; // Marcamos que hemos encontrado al alumno
                            break; // Salimos del bucle
                        }
                    }
                    if (!encontrado) { // Si no hemos encontrado al alumno
                        System.out.println("Alumno no encontrado."); // Mostramos un mensaje indicando que no lo hemos
                                                                     // encontrado
                    }

                    break;
                case 5:
                    // Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un
                    // alumno y permitir modificar su nota si el alumno existe.
                    System.out.print("Ingresa el nombre del alumno a modificar: ");
                    String nombreModificar = ejemplo1.nextLine(); // Leemos el nombre del alumno a modificar
                    encontrado = false; // Reiniciamos la variable para saber si hemos encontrado al alumno
                    for (int i = 0; i < nombresAlumnos.length; i++) { // Recorremos el array de nombres
                        if (nombresAlumnos[i].equals(nombreModificar)) { // Si encontramos al alumno
                            System.out.print("Ingresa la nueva nota: ");
                            double nuevaNota = ejemplo.nextDouble(); // Leemos la nueva nota
                            notas[i] = nuevaNota; // Actualizamos la nota del alumno
                            encontrado = true; // Marcamos que hemos encontrado al alumno
                            break; // Salimos del bucle
                        }
                    }
                    if (!encontrado) { // Si no hemos encontrado al alumno
                        System.out.println("Alumno no encontrado."); // Mostramos un mensaje indicando que no lo hemos
                                                                     // encontrado
                    }

                    break;
                case 6:
                    // Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
                    System.out.print("Ingresa el nombre del alumno a eliminar: ");
                    String nombreAEliminar = ejemplo1.next(); // Leemos el nombre del alumno a eliminar
                    encontrado = false; // Reiniciamos la variable para saber si hemosencontrado al alumno
                    for (int i = 0; i < nombresAlumnos.length; i++) { // Recorremos el array de nombres
                        if (nombresAlumnos[i].equals(nombreAEliminar)) { // Si encontramos al alumno
                            encontrado = true; // Marcamos que hemos encontrado al alumno
                            nombresAlumnos[i] = "";
                            notas[i] = 0;
                            System.out.println("Alumno eliminado");
                        }
                        
                    }
                    if (!encontrado) { // Si no hemos encontrado al alumno
                    System.out.println("Alumno no encontrado."); // Mostramos unmensaje indicando que no lo hemos encontrado
                    }
                    break;
                case 7: // Salimos del programa
                     System.out.println("Salir del programa");// Terminamos la ejecución del programa
                default:
                    break;
            }

        } while (opcion != 7);

        ejemplo.close();
        ejemplo1.close();
    }
}