package string;

import randomlogicproblems.PrimeNumber;

public class PrintLCS {

    private int getLcs(char[] X, char[] Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        int result = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[m][n];
    }

    private boolean isSubsequence(String str1, String str2, int m, int n) {
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return isSubsequence(str1, str2, m - 1, n - 1);
        }
        return isSubsequence(str1, str2, m - 1, n);
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "gksrek";
        char[] X = str1.toCharArray();
        char[] Y = str2.toCharArray();
        PrintLCS printLCS = new PrintLCS();
//        int result = printLCS.getLcs(X, Y, X.length, Y.length);
//        System.out.println(result);
        boolean isSubsequence = printLCS.isSubsequence(str1, str2, str1.length(), str2.length());
        System.out.println(isSubsequence);

    }

}
