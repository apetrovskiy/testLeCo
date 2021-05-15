package problems.easy.ClimbingStairs

class SolutionKt {
    fun climbStairs(n: Int): Int {
        if (1 == n)
            return 1
        if (2 == n)
            return 2
        var values = IntArray(n)
        values[0] = 1
        values[1] = 2
        for (i in 2..n - 1)
            values[i] = values[i - 1] + values[i - 2]
        return values[n - 1]
    }
}
