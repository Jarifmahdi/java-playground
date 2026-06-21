package TwoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        outerLoop: for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                System.out.println(nums[i] + " " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    break outerLoop;
                }
            }
        }
        return new int[] { i, j };
    }
}