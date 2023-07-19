package problems.easy.MaximumSubarray

class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {
        var currentMaximum = Integer.MIN_VALUE
        var maximumAtTheEnd = 0
        for (i in 0..nums.size - 1) {
            maximumAtTheEnd += nums[i]
            currentMaximum = if (maximumAtTheEnd > currentMaximum) maximumAtTheEnd else currentMaximum
            maximumAtTheEnd = if (maximumAtTheEnd < 0) 0 else maximumAtTheEnd
        }
        return currentMaximum
    }
}
