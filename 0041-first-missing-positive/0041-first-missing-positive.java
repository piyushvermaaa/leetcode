class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Place every number at its correct index
        for (int i = 0; i < n; ) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 &&
                nums[i] <= n &&
                nums[i] != nums[correct]) {
                // Swap nums[i] with nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        // Find the first index where the number is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return n + 1;
    }
}