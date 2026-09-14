class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max_count = 0;
        int window_count = 0;    
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                window_count++;
            }
        }
        max_count = window_count;
        for(int i = 0; i < n-k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                window_count--;
            }
            ch = s.charAt(i+k);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                window_count++;
            }
            max_count = Math.max(max_count, window_count);
        }
        return max_count;
    }
}