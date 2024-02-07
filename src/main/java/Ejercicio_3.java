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
}
