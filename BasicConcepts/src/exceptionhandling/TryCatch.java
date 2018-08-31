package exceptionhandling;

public class TryCatch {

    public static void main(String... args) {
        int[] arr = new int[4];
        try {
            int a = arr[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
//            e.printStackTrace();
        }
        System.out.print("Hello World");
    }
}
