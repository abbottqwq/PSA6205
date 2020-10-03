import java.util.ArrayList;
import java.util.Stack;

public class Q20LeetCode456 {
    class Solution {
        public boolean find132pattern(int[] nums) {
            int[] minList = new int[nums.length];
            minList[0] = nums[0];
            for (int i = 1; i < nums.length; i++)
                minList[i] = Math.min(nums[i], minList[i - 1]);
            Stack<Integer> stack = new Stack<>();
            for(int i = nums.length - 1; i >= 0 ; i--){
                while(!stack.empty() && minList[i] >= stack.peek())
                    stack.pop();
                if(!stack.empty() && nums[i]>stack.peek()) return true;
                stack.push(nums[i]);
            }
            return false;
        }
    }
}
