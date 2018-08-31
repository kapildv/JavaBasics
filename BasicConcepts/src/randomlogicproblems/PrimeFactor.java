package randomlogicproblems;

public class PrimeFactor {

    private void findPrimeFactor(int n) {
        int number = n;
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number = number / 2;
        }

        for (int i = 3; i < Math.sqrt(number); i = i + 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        if (number > 2) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        PrimeFactor primeFactor = new PrimeFactor();
        primeFactor.findPrimeFactor(315);
    }
}
