class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcon = 0;
        int con = 0;
        for(int x : nums){
            if(x == 1){
                con++;
            }
            else{
                maxcon = Math.max(maxcon, con);
                con = 0;
            }
        }
        if(con > maxcon){
            return con;
        }
        return maxcon;
    }
}