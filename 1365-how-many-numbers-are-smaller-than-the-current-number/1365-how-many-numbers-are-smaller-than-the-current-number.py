class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        l1 = []
        large = 0
        for i in range(n):
            for j in range(n):
                if nums[i] > nums[j]:
                    large+=1
            l1.append(large)
            large = 0
        return l1