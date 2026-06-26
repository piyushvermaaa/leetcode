class Solution(object):
    def reverseString(self, s):
        n = len(s)
        l1 = []

        for i in range(n - 1, -1, -1):
            l1.append(s[i])

        for i in range(n):
            s[i] = l1[i]