
import java.util.ArrayList;
import java.util.Stack;

public class Q8LeetCode1019 {
    class Solution {
        public int[] nextLargerNodes(ListNode head) {
            Stack<Integer> stack = new Stack<Integer>();
            int len = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            ListNode p = head;
            while (p != null) {
                list.add(p.val);
                p = p.next;
                len++;
            }
            int[] res = new int[len];

            for (int i = list.size() - 1; i >= 0; i--) {
                int x = list.get(i);
                if (stack.empty()) {
                    stack.push(x);
                    continue;
                } else {
                    while (!stack.empty() && stack.peek() <= x)
                        stack.pop();
                    res[i] = stack.empty() ? 0 : stack.peek();
                    stack.push(x);
                }
            }

            return res;
        }
    }
}
