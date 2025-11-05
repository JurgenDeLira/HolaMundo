package EjerciciosOperadores;

/*
Crea un programa que determine si una persona puede acceder a un
descuento dependiendo de su edad y si es estudiante.
Si la persona tiene 18 años o más y es estudiante, mostrará:
"Descuento aplicado".
En caso contrario, mostrará:
"No aplica descuento".
Usa operadores:
Relacionales: >=, ==
Lógicos: && (AND), || (OR)
 */

import java.util.Scanner;

public class OperadoresRelacionalesLogicos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que edad tienes?: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("¿Eres estudiante? si/no: ");
        String estudiante = sc.nextLine();

        boolean esEstudiante = estudiante.equalsIgnoreCase("si");

        if (edad >= 18 && esEstudiante){
            System.out.println("Descuento aplicado");
        } else {
            System.out.println("No aplica descuento");
        }

        sc.close();
    }
}
