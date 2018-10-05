package string;

import java.util.ArrayList;

public class RemoveOccurenceOfCharacter {


    private void removeOccurence(char array[], char character) {
        ArrayList<String> str = new ArrayList<>();
        char[] new_array = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != character) {
                str.add(String.valueOf(array[i]));
            }
        }
        System.out.println(str);

    }

    public static void main(String[] args) {
        RemoveOccurenceOfCharacter rm = new RemoveOccurenceOfCharacter();
        String name = "geeksforgeeks";
        char[] array = name.toCharArray();

        rm.removeOccurence(array, 'e');

    }
}
