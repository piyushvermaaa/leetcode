class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int esum = 0;
        int asum = 0;
        for(int i = 0; i < n;i++){
            esum = esum + i;
            asum = asum + nums[i];
        }
        esum = esum + n;
        int result = esum - asum;
        return result;
    }
}