class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxCount = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxCount++;
            }
        }
        int count = maxCount;
        for(int i = 1; i <= n-k; i++){
            char ch = s.charAt(i-1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count--;
            }
            ch = s.charAt(i+k-1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}