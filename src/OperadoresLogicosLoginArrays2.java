import java.util.Scanner;

public class OperadoresLogicosLoginArrays2 {
    public static void main(String[] args) {

        String[] usernames = {"jorge", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = scanner.next();

        System.out.println("Ingrese el password: ");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if ( (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) ){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado == true){ // o simplemente (esAutenticado)
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecta");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
