package CodeLab.Week1.Day1;

import java.util.HashSet;

public class Q4IsUnique {
    public boolean isUnique(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++)
            if (set.contains(s.charAt(i))) return false;
            else set.add(s.charAt(i));
        return true;
    }


}
