public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++ /* que también es i = i+1*/){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 2ms, 1000 => 4 ms, 10,000 => 105 ms
            //c += a + b + "\n"; // que también es c = c + a + b "\n"; // 500 => 19 ms, 1000 => 21 ms, 10,000 => 68ms

            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10,000 => 2ms
            /* puede ser asi también= sb.append(a);
            sb.append(b);
            sb.append("\n");*/
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
