package string;

public class Palindrome {

    private boolean isPalindrome(char[] array) {
        int start = 0;
        int end = array.length;
        while (start < end) {
            if (array[start] == array[end - 1]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String str) {
        StringBuilder string = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            string.append(str.charAt(length - i - 1));
        }
        String newString = new String(string);
        return str.equals(newString);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String str = "bbobobb";
        char[] array = str.toCharArray();
        System.out.println(palindrome.isPalindrome(array));
        System.out.println(palindrome.isPalindrome(str));

    }
}
