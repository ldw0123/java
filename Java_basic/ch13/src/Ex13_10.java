public class Ex13_10 {
    public static void main(String[] args) {
        int n = 100_000;
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all numbers to be prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}