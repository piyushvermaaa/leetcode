class Solution(object):
    def findDisappearedNumbers(self, nums):
        nums.sort()
        n = len(nums)

        ans = []
        j = 0

        for i in range(1, n + 1):
            while j < n and nums[j] < i:
                j += 1

            if j == n or nums[j] != i:
                ans.append(i)

        return ans