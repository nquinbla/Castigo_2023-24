import java.util.ArrayList;
public class Ejercicio_3 {

    public static int[] encontrarMultiplos( int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0) {
                multiplos.add(i);
            }
        }
        return multiplos.stream().mapToInt(i -> i).toArray();
    }
    public static int sumarValores(int[] values) {
        int suma = 0;
        for (int i = 0; i < values.length; i++) {
            suma += values[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] multiplos = encontrarMultiplos(1, 100);
        int suma = sumarValores(multiplos);

        System.out.println("La suma de los multiplos de 3 entre 1 y 100 es: " + suma);
    }
}
