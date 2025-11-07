package EjerciciosFlujosDeControl;

//Solicita un número del 1 al 12 y muestra cuántos días tiene el mes
//correspondiente (no considerar bisiestos).

import java.util.Scanner;

public class DiaMesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número del mes (1-12): ");
        int mes = sc.nextInt();

        //TODO: usa switch

        int dias = 0;
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28;
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default:
                System.out.println("Número inválido. Debe ser entre 1 y 12");
                sc.close();
                return;
        }
        System.out.println("El mes " + nombreMes + " tiene " + dias + " días");
        sc.close();
    }
}
