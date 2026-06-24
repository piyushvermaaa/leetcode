class Solution(object):
    def isPalindrome(self, x):
        
        y = str(x)
        reverse_x = y[::-1]
        if y == reverse_x:
            return True
        else: 
            return False
