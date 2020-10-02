

import java.util.Stack;

public class Q12LeeCode20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && (c == stack.peek() + 1 || c == stack.peek() + 2))
                    stack.pop();
                else
                    stack.push(c);
            }
            return stack.isEmpty();
        }
    }
}
