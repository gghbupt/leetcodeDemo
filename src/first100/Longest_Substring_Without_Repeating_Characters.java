package first100;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 1;
        int index = -1;
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > index) {
                index = map.get(s.charAt(i));
            }
            max = Math.max(max, i - index);
            map.put(s.charAt(i), i);
        }
        return max;
    }
}
