class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        n = len(nums)
        for i in range(0,n):
            if nums[i] == target:
                return i
            elif ((nums[i] > target) and (nums[i - 1] < target)):
                return i
            elif (nums[i] < target) and i == n-1:
                return i + 1
            elif target < nums[0]:
                return 0