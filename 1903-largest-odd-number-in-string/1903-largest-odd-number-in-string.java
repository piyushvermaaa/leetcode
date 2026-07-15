class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String ans = "";
        int i = n - 1;
        while((i >= 0) && (num.charAt(i) != '1' && num.charAt(i) != '3' && num.charAt(i) != '5' &&  num.charAt(i) != '7' &&  num.charAt(i) != '9')){
            i--;
        }
        String result = num.substring(0,i+1);
        return result;
    }
}