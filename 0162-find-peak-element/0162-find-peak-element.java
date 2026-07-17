import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
        int mi = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[mi]){
                mi = i;
            }
        }
        return mi;}
    }