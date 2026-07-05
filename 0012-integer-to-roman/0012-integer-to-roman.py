class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        integer = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        roman = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        result = ''
        for i in range(len(integer)):
            while num >= integer[i]:
                result = result + roman[i]
                num = num - integer[i]
        return result