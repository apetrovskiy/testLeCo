package problems.easy.MaximumSubarray
object SolutionScala {
  def maxSubArray(nums: Array[Int]): Int = {
    // nums.scanLeft(0)((acc, n) => math.max(0, acc + n)).max
    var currentMaximum = -2000000000
    var maximumAtTheEnd = 0
    for (i <- 0 to nums.size - 1) {
      maximumAtTheEnd += nums(i)
      if (currentMaximum < maximumAtTheEnd)
        currentMaximum = maximumAtTheEnd
      if (maximumAtTheEnd < 0)
        maximumAtTheEnd = 0
    }
    currentMaximum
  }
}
