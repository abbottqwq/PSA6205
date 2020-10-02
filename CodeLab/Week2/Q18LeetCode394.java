import java.util.ArrayList;
import java.util.Stack;

public class Q18LeetCode394 {
    class Solution {
        public String decodeString(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if (c == ']') {
                    ArrayList<Character> list = new ArrayList<Character>();
                    while (stack.peek() != '[')
                        list.add(stack.pop());
                    stack.pop();
                    int n = 0;
                    int d = 1;
                    while (!stack.empty() && Character.isDigit(stack.peek())) {
                        n += (stack.pop() - '0') * d;
                        d *= 10;
                    }
                    for (int i = 0; i < n; i++)
                        for (int j = list.size() - 1; j >= 0; j--) {
                            stack.push(list.get(j));
                        }

                } else {
                    stack.push(c);
                }
            }
            StringBuilder res = new StringBuilder();
            while (!stack.empty()) {
                res.insert(0, stack.pop());
            }
            return res.toString();
        }
    }
}
