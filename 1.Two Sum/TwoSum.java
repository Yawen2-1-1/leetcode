/*********************************
 **     Runtime: 10ms           **
 **     Memory Usage: 39.4 MB   **
 *********************************/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2]; // return indices of the two numbers

        // target - nums[i] = sub
        // traverse and find if sub exists in the array
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            for (int j = (i+1); j < nums.length; j++) {
                if (nums[j] == sub) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}
