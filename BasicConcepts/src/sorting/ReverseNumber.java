package sorting;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(rev);
    }

}
