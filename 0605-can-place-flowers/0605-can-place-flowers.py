class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        l1 = list(flowerbed)
        l = len(l1)
        k = n

        # Special case: only one plot
        if l == 1:
            if l1[0] == 0:
                return k <= 1
            else:
                return k == 0

        for i in range(l):

            # First position
            if i == 0:
                if l1[0] == 0 and l1[1] == 0:
                    l1[0] = 1
                    k -= 1

            # Middle positions
            elif 0 < i < l - 1:
                if l1[i - 1] == 0 and l1[i] == 0 and l1[i + 1] == 0:
                    l1[i] = 1
                    k -= 1

            # Last position
            else:  # i == l - 1
                if l1[l - 2] == 0 and l1[l - 1] == 0:
                    l1[l - 1] = 1
                    k -= 1

            # If we've already planted enough flowers
            if k <= 0:
                return True

        return False