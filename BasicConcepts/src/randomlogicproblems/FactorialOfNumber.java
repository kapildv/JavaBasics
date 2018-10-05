package randomlogicproblems;

public class FactorialOfNumber {

    private int getFactorial(int number) {
        if (number > 1) {
            return number * getFactorial(number - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();

        System.out.print(factorialOfNumber.getFactorial(5));

    }
}
