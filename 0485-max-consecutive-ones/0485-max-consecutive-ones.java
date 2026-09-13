class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcnt = 0;
        int con = 0;
        for(int x : nums){
            if(x == 1){
                con++;
            }
            else{
                maxcnt = Math.max(maxcnt, con);
                con = 0;
            }
        }
        if(maxcnt < con){
            maxcnt = con;
        }
        return maxcnt;
    }
}