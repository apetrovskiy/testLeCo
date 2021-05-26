package problems.easy.MajorityElement

object SolutionScala {
  def majorityElement(nums: Array[Int]): Int = {
    val minNumberNeeded = math.floor(nums.length / 2) + 1
    var results: scala.collection.mutable.Map[Int, Int] =
      scala.collection.mutable.Map()
    for (i <- nums.indices) {
      if (!results.contains(nums(i))) {
        results += (nums(i) -> 1)
      } else {
        results(nums(i)) = results(nums(i)) + 1
      }
    }
    println(results)
    for ((k, v) <- results) {
      println(s"key = {k}, values = {v}")
      if (v >= minNumberNeeded) {
        return k
      }
    }

    0
  }
}
