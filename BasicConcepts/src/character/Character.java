package character;

import java.util.ArrayList;

public class Character {

    public static void print() {
        char c = 'a';
        for (int i = 0; i <26; i++) {
            int a=c+i;
            System.out.println(((char) a));
        }
    }

    private static ArrayList<String> findlongestSequence(char arr[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        int len = arr.length;
        int size = 1;
        int i;
        for (i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1] || (arr[i] + 1) == arr[i + 1]) {
                System.out.print(arr[i] + "");
                size++;
            } else {
                System.out.print(arr[i]+"");
                System.out.println();
                size = 1;
            }
        }
        System.out.print(arr[i]);
        System.out.println();
        System.out.println(size);
        return null;

    }

    public static void main(String[] args) {
        print();

//        String str = "aabcaaabcdmnaaabcdef";

        String str = "aabc";
        findlongestSequence(str.toCharArray());

    }
}
