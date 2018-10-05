package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CountOccurence {
    HashMap<Character, Integer> map;

    private HashMap<Character, Integer> countOccurrence(char[] arr) {
        map = new LinkedHashMap();
        for (char anArr : arr) {
            int value = 1;
            if (map.containsKey(anArr)) {
                int val = map.get(anArr);
                map.put(anArr, ++val);
            } else {
                map.put(anArr, value);
            }
        }
        return map;
    }

    private String createString() {
        StringBuilder builder = new StringBuilder();
        Set set = map.keySet();
        for (Object a : set) {
            builder.append(a);
        }
        String str = builder.toString();
        System.out.println(str);
        return str;

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();

        CountOccurence countOccurence = new CountOccurence();
        HashMap<Character, Integer> map = countOccurence.countOccurrence(arr);
        System.out.println(map.keySet());
        String str1 = countOccurence.createString();
        System.out.println(str1);
    }
}
