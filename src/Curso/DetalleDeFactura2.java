package Curso;

import java.util.Scanner;

public class DetalleDeFactura2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto (con decimales): ");
        Double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto (con decimales): ");
        Double precio2 = scanner.nextDouble();

        Double totalBruto = precio1 + precio2;
        Double impuesto = totalBruto * 00.19;
        Double totalNeto = totalBruto + impuesto;

        System.out.println("La factura " + nombre + " tiene un total bruto de " + totalBruto +
                ", con un impuesto de " + impuesto + " y el monto después del impuesto es de "
        + totalNeto);



    }
}
