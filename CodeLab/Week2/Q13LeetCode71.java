import java.util.ArrayList;
import java.util.Stack;

public class Q13LeetCode71 {
    class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<String>();
            for (String s : path.split("/")) {
                if (s.equals("..")) {
                    if (!stack.empty())
                        stack.pop();
                } else if (s.equals(".") || s.isEmpty()) {
                    continue;
                } else {
                    stack.push(s);
                }
            }
            StringBuilder res = new StringBuilder();
            for (String s : stack) {
                res.append("/");
                res.append(s);
            }
            if (res.length() == 0)
                return "/";
            return res.toString();
        }
    }
}
