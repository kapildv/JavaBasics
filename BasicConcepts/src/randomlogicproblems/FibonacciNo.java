package randomlogicproblems;

public class FibonacciNo {
    
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNo fibonacciNo = new FibonacciNo();
        for (int i = 0; i < 6; i++) {
            System.out.print(fibonacciNo.fibonacci(i) + " ");
        }

    }
}
