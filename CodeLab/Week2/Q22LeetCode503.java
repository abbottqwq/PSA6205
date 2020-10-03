import java.util.Stack;

public class Q22LeetCode503 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            Stack<Integer> stack = new Stack<>();
            int[] minList = new int[nums.length];
            for (int i = 2 * nums.length - 1; i >= 0; i--) {
                if (stack.empty()) {
                    stack.push(nums[i % nums.length]);
                    continue;
                } else {
                    while (!stack.empty() && nums[i % nums.length] >= stack.peek())
                        stack.pop();
                    minList[i % nums.length] = stack.empty() ? -1 : stack.peek();
                    stack.push(nums[i % nums.length]);
                }
            }
            return minList;
        }
    }
}
