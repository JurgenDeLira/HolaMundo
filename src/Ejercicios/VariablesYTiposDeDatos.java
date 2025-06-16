package Ejercicios;

/*
Escribe un programa que almacene tu nombre, edad y si estás
inscrito en un curso (true/false), y luego imprímelo en la consola.
 */

import java.util.Scanner;

//Forma directa:
public class VariablesYTiposDeDatos {
    public static void main(String[] args) {

        String name = new String();
        name = "Jorge Eduardo De Lira Bustillos";
        Integer edad = (30);
        Boolean inscritoEnCurso = true;

        System.out.println("Nombre: " + name +
                "\nEdad: " + edad +
                "\n¿Está inscrito?: " + inscritoEnCurso);
    }
}

//Pidiendote los datos:
class Preguntandome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String name = scanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Estás inscrito? (responde con: si / no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        boolean inscrito;
        if (respuesta.equals("si") || respuesta.equals("sí")){
            inscrito = true;
        } else if (respuesta.equals("no")) {
            inscrito = false;
        } else {
            System.out.println("Respuesta no válida. Se asume que no estás inscrito");
            inscrito = false;
        }


        System.out.println("Nombre: " + name +
                "\nEdad: " + age +
                "\nInscrito: " + inscrito);
        scanner.close();
    }
}