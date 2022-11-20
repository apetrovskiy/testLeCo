package problems.easy.ClimbingStairs;

@SuppressWarnings("PMD")
class Solution {
    public int climbStairs(int n) {
        if (1 == n)
            return 1;
        if (2 == n)
            return 2;
        var values = new int[n];
        values[0] = 1;
        values[1] = 2;
        if (2 < n) {
            for (var i = 2; i < n; i++)
                values[i] = values[i - 1] + values[i - 2];
        }
        return values[n - 1];
    }
}
