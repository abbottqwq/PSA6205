import java.util.Stack;

public class Q19LeetCode402 {
    class Solution {
        public String removeKdigits(String num, int k) {
            if (num.isEmpty())
                return null;
            Stack<Character> stack = new Stack<Character>();
            for (char c : num.toCharArray()) {
                while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                    stack.pop();
                    k--;
                }
                stack.push(c);
            }
            while (!stack.empty() && k > 0) {
                stack.pop();
                k--;
            }
            if (stack.isEmpty())
                return "0";
            StringBuilder res = new StringBuilder();
            while (!stack.empty()) {
                res.insert(0, stack.pop());
            }
            while (res.length() > 0 && res.charAt(0) == '0')
                res.deleteCharAt(0);
            if (res.length() == 0)
                return "0";
            return res.toString();
        }
    }
}
