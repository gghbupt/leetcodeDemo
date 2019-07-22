package first100;

public class Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        int len = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < len + 1 || strs[i].charAt(len) != strs[0].charAt(len)) {
                break;
            }
            len++;
        }
        return strs[0].substring(0, len + 1);
    }
}
