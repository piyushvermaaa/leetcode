class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + nums[i];
        }
        double maxSum = windowSum;
        for(int i = k; i < nums.length; i++){
            maxSum -= nums[i-k];
            maxSum += nums[i];
            if(maxSum > windowSum){
                windowSum = maxSum;
            }
        }

        double ans = windowSum/k;
        return ans;
    }
}