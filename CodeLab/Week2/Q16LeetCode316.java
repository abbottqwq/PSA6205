import java.util.HashMap;
import java.util.Stack;

public class Q16LeetCode316 {
    class Solution {
        public String removeDuplicateLetters(String s) {
            HashMap<Character, Integer> lastPosi = new HashMap<Character, Integer>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++)
                lastPosi.put(chars[i], i);
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (!stack.contains(c)) {
                    while (!stack.empty() && c < stack.peek() && i < lastPosi.get(stack.peek())) {
                        stack.pop();
                    }
                    stack.push(c);
                }
            }
            StringBuilder res = new StringBuilder();
            while (!stack.empty())
                res.insert(0, stack.pop());
            return res.toString();
        }
    }
}
