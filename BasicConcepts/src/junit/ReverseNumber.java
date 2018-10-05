package junit;

public class ReverseNumber {

    public int revers() {
        int num = 123;
        int new_num = 0;
        while (num != 0) {
            new_num = new_num * 10 + (num % 10);
            num = num / 10;
        }
        return new_num;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().revers());

    }
}
