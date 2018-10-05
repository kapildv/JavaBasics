package string;

public class LongesetCommonSubsequence {
    StringBuilder builder= new StringBuilder();

    private int getLcs(char[] X, char[] Y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X[m - 1] == Y[n - 1]) {
            return 1 + getLcs(X, Y, m - 1, n - 1);
        } else {
            return max(getLcs(X, Y, m, n - 1), getLcs(X, Y, m - 1, n));
        }
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        char[] X = str1.toCharArray();
        char[] Y = str2.toCharArray();
        LongesetCommonSubsequence lcs = new LongesetCommonSubsequence();
        System.out.println(lcs.getLcs(X, Y, X.length, Y.length));
        System.out.println(lcs.builder.toString());
    }
}
