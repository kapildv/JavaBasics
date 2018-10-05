package string;

public class StringReverse {

    static StringBuilder stringBuilder= new StringBuilder();

    private static void reverseUsingArrayRecursion(char arr[], int start, int end) {
        if (start >= end) {
            return;
        } else {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseUsingArrayRecursion(arr, start + 1, end - 1);
        }

    }

    private static void reverseUsingStringRecursion(String str) {
        if (str == null || str.length() <= 1) {
            stringBuilder = stringBuilder.append(str);
        } else {
            stringBuilder = stringBuilder.append(str.charAt(str.length() - 1));
            reverseUsingStringRecursion(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String name = "Kapil Dev";
        char[] array = name.toCharArray();
        reverseUsingArrayRecursion(array, 0, array.length - 1);
        String rev_name = new String(array);
        System.out.println(rev_name);
        reverseUsingStringRecursion(name);
        System.out.println(stringBuilder);
    }
}
