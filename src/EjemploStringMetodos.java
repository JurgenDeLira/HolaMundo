public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Jorge";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Jorge\") = " + nombre.equals("Jorge"));
        System.out.println("nombre.equals(\"jorge\") = " + nombre.equals("jorge"));
        System.out.println("nombre.equalsIgnoreCase(\"jorge\") = " + nombre.equalsIgnoreCase("jorge"));
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Jorge"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(3, 5) = " + nombre.substring(3, 5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
    }
}
