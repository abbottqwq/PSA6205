

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
                stack.push(p.val);
                p = p.next;
                len++;
            }
            int[] res = new int[len];
            int max = -1;
            int index = len - 1;
            while (!stack.isEmpty()) {
                int val = stack.pop();
                if (val > max) {
                    res[index] = 0;
                    max = val;
                } else {
                    res[index] = max;
                }
                index--;
            }
            return res;
        }
    }
}
