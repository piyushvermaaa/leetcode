class Solution(object):
    def rotate(self, nums, k):

        k %= len(nums)

        l1 = nums[-k:]
        l2 = nums[:-k]

        nums[:] = l1 + l2