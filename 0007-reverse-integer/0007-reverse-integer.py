class Solution(object):
    def reverse(self, x):
        if (x > 2**31 - 1) or (x < -(2**31)):
            return 0

        elif x >= 0:
            a = str(x)
            c = a[::-1]
            b = int(c)

            if b > 2**31 - 1:
                return 0

            return b

        else:
            y = str(x)
            w = y[:0:-1]
            q = int(w)

            if q > 2**31:
                return 0

            return -q