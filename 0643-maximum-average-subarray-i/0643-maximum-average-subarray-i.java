class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum = 0;
        double window_sum = 0;
        for(int i = 0; i < k; i++){
            window_sum = window_sum + nums[i];
        }
        max_sum = window_sum;
        for(int i = k; i < nums.length; i++){
            window_sum -= nums[i-k];
            window_sum += nums[i];
            max_sum = Math.max(max_sum, window_sum);
        }
        double ans = max_sum/k;
        return ans;
    }
}