public class Ejercicio_5 {
    public static void main(String[] args) {
        int N = 10; // Número de elementos
        imprimirTablasDeMultiplicar(N);
    }
    private static void imprimirTablasDeMultiplicar(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println(); // Salto de línea para que quede más chulo
        }
    }
}
