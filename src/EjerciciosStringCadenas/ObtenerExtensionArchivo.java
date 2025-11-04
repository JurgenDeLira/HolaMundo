package EjerciciosStringCadenas;

/*
Que devuelva "jpg", "pdf", "txt", etc.
Ejemplo: documento.pdf → "pdf"
Si no hay punto, devuelve "sin extensión".
 */

import java.util.Scanner;

public class ObtenerExtensionArchivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el nombre de un archivo con su extensión: ");
        String nombreArchivo = sc.nextLine();


        // llamar al método
        String extension = obtenerExtension(nombreArchivo);
        System.out.println("extension = " + extension);
        sc.close();


    }
    public static String obtenerExtension(String nombreArchivo){
        if (!nombreArchivo.contains(".")){
            return "sin extensión";
        }
        int i = nombreArchivo.lastIndexOf(".");
        return nombreArchivo.substring(i+1);

    }
}
