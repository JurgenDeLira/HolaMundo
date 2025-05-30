package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        char num = 'z';
        switch (num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default: // esto es como el else
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "jorge";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "jorge":
                System.out.println("Hola jorge!");
                break;
            case "pepe":
                System.out.println("Hola pepe!");
                break;
            default:
                System.out.println("usuario desconocido!");
                break;
        }
    }
}
