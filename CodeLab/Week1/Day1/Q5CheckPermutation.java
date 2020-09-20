package CodeLab.Week1.Day1;

import java.util.HashMap;

public class Q5CheckPermutation {
    public boolean isPermutation(String s1, String s2) {
        int l = s1.length();
        if (l != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < l; i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c))
                map.replace(c, map.get(c) + 1);
            else map.put(c, 1);
            c = s2.charAt(i);
            if (map.containsKey(c))
                map.replace(c, map.get(c) - 1);
            else map.put(c, -1);
        }
        for (int x : map.values())
            if (x != 0) return false;
        return true;
    }


}
