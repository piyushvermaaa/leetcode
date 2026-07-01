class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        n = len(candies)
        l1 = []
        a = max(candies)
        for i in range(0,n):
            if candies[i] + extraCandies >= a:
                l1.append(True)
            else:
                l1.append(False)
        return l1