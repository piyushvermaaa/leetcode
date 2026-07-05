class Solution(object):
    def searchRange(self, nums, target):

        l1 = []

        for i in range(len(nums)):
            if nums[i] == target:
                l1.append(i)

        if len(l1) == 0:
            return [-1, -1]

        return [l1[0], l1[-1]]