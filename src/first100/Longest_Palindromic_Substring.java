package first100;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append('#');
        }
        int cen = 1;
        int r = 0;
        for (int i = 1; i < sb.length() - 1; i++) {
            int lo = i - 1;
            int hi = i + 1;
            while (lo >= 0);
        }
        return "";
    }
}
