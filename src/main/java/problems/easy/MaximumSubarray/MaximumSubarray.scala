package problems.easy.MaximumSubarray
object SolutionScala {
  def maxSubArray(nums: Array[Int]): Int = {
    nums.scanLeft(0)((acc, n) => math.max(0, acc + n)).max
  }
}
