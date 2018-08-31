package randomlogicproblems;

import java.util.HashMap;

public class PrimeFactorWithPower {
    private HashMap<Integer, Integer> map;

    private void primeFactorWithPower(int n) {
        map = new HashMap<>();
        int num = n;
        int count = 0;
        while (num % 2 == 0) {
            count++;
            map.put(2, count);
            num = num / 2;
        }

        for (int i = 3; i < Math.sqrt(num); i = i + 2) {
            int counter = 0;
            while (num % i == 0) {
                counter++;
                map.put(i, counter);
                num = num / i;
            }
        }
        if (num > 2) {
            map.put(num, 1);
        }
    }

    private void printHashMap() {
        System.out.print(map);
    }

    public static void main(String[] args) {
        PrimeFactorWithPower primeFactorWithPower = new PrimeFactorWithPower();
        primeFactorWithPower.primeFactorWithPower(317);
        primeFactorWithPower.printHashMap();

    }
}
