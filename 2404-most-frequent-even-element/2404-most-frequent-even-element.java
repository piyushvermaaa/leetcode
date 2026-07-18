import java.util.Arrays;
class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        int maxFreq = 0;
        int i = 0;
        while (i < nums.length) {
            int count = 1;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            if (nums[i] % 2 == 0 && count > maxFreq) {
                maxFreq = count;
                ans = nums[i];
            }
            i++;
        }
        return ans;
    }
}