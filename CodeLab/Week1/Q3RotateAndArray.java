package Week1;

public class Q3RotateAndArray {
    public void rotateAndArray(int[] nums, int k) {
        int l = nums.length;
        int[] res = new int[l];
        for(int i =0; i < l; i++){
            res[(i + k) % l] = nums[i];
        }
        for(int i =0; i < l; i++){
            nums[i] = res[i];
        }
    }
}
