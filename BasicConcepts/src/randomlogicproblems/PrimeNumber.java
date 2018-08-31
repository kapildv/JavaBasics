package randomlogicproblems;

public class PrimeNumber {

    private boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 31;
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.print(primeNumber.isPrime(num));
    }
}

