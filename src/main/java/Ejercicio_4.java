import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Introduce un número entero positivo (o un número negativo para terminar): ");
            number = scanner.nextInt();

            if (number > 0) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        } while (number >= 0);

        System.out.println("El número más pequeño es: " + min);
        System.out.println("El número más grande es: " + max);
    }
}

