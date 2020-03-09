package first100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Le017_Letter_Combinations_of_a_Phone_Number {
    public static Map<Integer, List<String>> dicMap = new HashMap<Integer, List<String>>(){
        {
            put(2,new ArrayList<String>(){{add("a");add("b");add("c");}});
            put(3,new ArrayList<String>(){{add("d");add("e");add("f");}});
            put(4,new ArrayList<String>(){{add("g");add("h");add("i");}});
            put(5,new ArrayList<String>(){{add("j");add("k");add("l");}});
            put(6,new ArrayList<String>(){{add("m");add("n");add("o");}});
            put(7,new ArrayList<String>(){{add("p");add("q");add("r");add("s");}});
            put(8,new ArrayList<String>(){{add("t");add("u");add("v");}});
            put(9,new ArrayList<String>(){{add("w");add("x");add("y");add("z");}});
        }
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() < 1) {
            return res;
        }
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            int cur = Integer.parseInt(digits.substring(i, i + 1));
            List<String> temp = new ArrayList<String>();
            List<String> num = dicMap.get(cur);
            for (int j = 0; j < res.size(); j++) {
                for (int k = 0; k < num.size(); k++) {
                    temp.add(res.get(j) + num.get(k));
                }
            }
            res = temp;
        }
        return res;
    }
}
