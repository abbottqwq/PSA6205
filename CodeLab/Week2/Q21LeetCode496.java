import java.util.HashMap;
import java.util.Stack;

public class Q21LeetCode496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            if (nums1.length == 0)
                return new int[0];
            if (nums2.length == 0)
                return new int[0];
            Stack<Integer> stack = new Stack<>();
            int[] minList = new int[nums2.length];
            for (int i = nums2.length - 1; i >= 0; i--) {
                if (stack.empty()) {
                    stack.push(nums2[i]);
                    continue;
                } else {
                    while (!stack.empty() && nums2[i] >= stack.peek())
                        stack.pop();
                    minList[i] = stack.empty() ? -1 : stack.peek();
                    stack.push(nums2[i]);
                }
            }
            minList[minList.length - 1] = -1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++)
                map.put(nums2[i], minList[i]);
            int[] res = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++)
                res[i] = map.get(nums1[i]);
            return res;
        }
    }
}
