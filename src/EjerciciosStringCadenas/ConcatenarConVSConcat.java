package EjerciciosStringCadenas;

/*
Crea un bucle que concatene 100 000 veces la palabra "Java" con:
+
concat()
StringBuilder
Mide el tiempo con System.currentTimeMillis() para comparar rendimiento.
 */
public class ConcatenarConVSConcat {
    public static void main(String[] args) {

        int repeticiones = 100000;

        // usando "+"
        String palabra = "";
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < repeticiones; i++){
            palabra += "java";
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo con + : " + (fin - inicio) + " ms");

        // usando concat()
        palabra = "";
        inicio = System.currentTimeMillis();
        for (int i = 0; i < repeticiones; i++){
            palabra.concat("java");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo con concat : " + (fin - inicio) + " ms");

        //usando stringbulder
        StringBuilder sb = new StringBuilder();
        inicio = System.currentTimeMillis();
        for (int i = 0; i < repeticiones; i++){
            sb.append(palabra);
        }
        fin= System.currentTimeMillis();
        System.out.println("Tiempo con stringbuilder : " + (fin - inicio) + " ms");


    }
}
