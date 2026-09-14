class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int lb = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(target <= nums[mid]){
                lb = mid;
                high = mid - 1;
            }
            else if(target == nums[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }   
        return lb;
    }
}