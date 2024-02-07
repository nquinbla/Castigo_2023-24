import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores:");
        int N = scanner.nextInt();
        int[] vector1 = receiveVector(N);
        int[] vector2 = receiveVector(N);
        int dotProduct = calculateDotProduct(vector1, vector2);
        System.out.println("El producto escalar de los vectores es: " + dotProduct);
    }

    public static int[] receiveVector(int N) {
        int[] vector = new int[N];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del vector:");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calculateDotProduct(int[] vector1, int[] vector2) {
        int dotProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        return dotProduct;
    }
}

