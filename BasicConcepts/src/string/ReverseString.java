package string;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReverseString {

    static void reverseWoord(String str) {

//        Pattern pattern = Pattern.compile("\\s");
        char[] str1 = str.toCharArray();
        int low = 0;
        int high = str1.length;
        while (low < high) {
            char temp = str1[low];
            str1[low] = str1[high - 1];
            str1[high - 1] = temp;
            low++;
            high--;
        }
        String string = new String(str1);
        System.out.println(string);

    }

    static String reverseWords(String str) throws NumberFormatException {
//        Pattern pattern = Pattern.compile("//s");
        String[] arr = str.split("\\s");
        for (String s : arr) {
            System.out.println(s);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(reverseWord(arr[i]) + " ");
        }
        String string = builder.toString();
        System.out.println(string);
        return string;
//        String outputString = "";
//        for (int i = 0; i < arr.length; i++) {
//            outputString = outputString + arr[i];
//        }
//        System.out.println(outputString);

    }

    public static String reverseWord(String s) throws NullPointerException {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int value = array.length - 1;
        while (value >= 0) {
            sb.append(array[value]);
            value--;
        }
        String str = sb.toString();
        System.out.println(str.trim());
        return str;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks to welcome";

        String s2=reverseWords(s1);

        String s3= reverseWord(s2);


    }

}
