import java.util.ArrayList;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int N = 10; // Cambia este valor por el número de primos que quieras generar
        ArrayList<Integer> primes = calculatePrimes(N);
        System.out.println("Los primeros " + N + " números primos son: " + primes);
    }

    public static ArrayList<Integer> calculatePrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        int number = 2;
        while (primes.size() < N) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
