package Week1;

import java.util.HashMap;

public class Q2TwoSumProblem {
    public int[] twoSumProblem(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(nums[i])) {
                //map.forEach((key, value)->System.out.println(key + ": " + value));
                return new int[]{map.get(nums[i]), i};
            } else {

                map.put(remain, i);
            }
        }
        return new int[]{};
    }
}

