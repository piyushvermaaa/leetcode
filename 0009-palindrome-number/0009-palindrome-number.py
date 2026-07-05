class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        y = str(x)
        reverse_str = y[::-1]
        if y == reverse_str:
            return True
        else:
            return False