class Solution:
    def climbStairs(self, n: int) -> int:
        '''
        # via recursion
        result = 0
        if n == 1:
            result = 1
        elif n == 2:
            result = 2
        else:
            result = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        return result
        '''
        if n == 1:
            return 1
        elif n == 2:
            return 2
        else:
            values = [0]*n
            values[0]=1
            values[1]=2
            for i in range(2,n):
                values[i]=values[i-1]+values[i-2]
            return values[n-1]
