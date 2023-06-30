package problems.easy.ClimbingStairs
object SolutionScala {
  def climbStairs(n: Int): Int = {
    if (1 == n)
      return 1
    if (2 == n)
      return 2
    var values = Array.range(0, n)
    values(0) = 1
    values(1) = 2
    for (i <- 2 to n - 1)
      values(i) = values(i - 1) + values(i - 2)

    values(n - 1)
  }
}
