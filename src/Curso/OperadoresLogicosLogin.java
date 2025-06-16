package Curso;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "jorge";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = scanner.next();

        System.out.println("Ingrese el password: ");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        if ( (username.equals(usuario) && password.equals(contrasena)) ||
                (username2.equals(usuario) && password2.equals(contrasena)) ){
            esAutenticado = true;
        } else {
            System.out.println("Username o contraseña incorrecta");
        }

        if (esAutenticado == true){ // o simplemente (esAutenticado)
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
