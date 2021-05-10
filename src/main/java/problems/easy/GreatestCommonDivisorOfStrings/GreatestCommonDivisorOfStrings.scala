package problems.easy.GreatestCommonDivisorOfStrings

object SolutionScala {
  def gcdOfStrings(str1: String, str2: String): String = {
    var result = ""
    val maxDivisorLength = List(str1.size, str2.size).min
    var currentDivisor = ""
    for (i <- maxDivisorLength - 1) {
      currentDivisor += str1(i)
      if (
        isDivisorOf(currentDivisor, str1) && isDivisorOf(currentDivisor, str2)
      )
        result = currentDivisor
    }
    result
  }

  def isDivisorOf(divisor: String, data: String): Boolean = {
    var result = false
    if (divisor.size > data.size)
      result
    if (divisor == data)
      true
    val listFromData = data.split(divisor)
    result = listFromData.forall(_ => _ == "")
    result
  }
}
