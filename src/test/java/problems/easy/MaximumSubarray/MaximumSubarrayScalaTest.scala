package problems.easy.MaximumSubarray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MaximumSubarrayScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  def shouldCalculateMaximumSubarray(
      inputArray: Array[Int],
      expectedResult: Int
  ) = {
    assertEquals(expectedResult, SolutionScala.maxSubArray(inputArray))
  }
}

object MaximumSubarrayScalaTest {
  def getInputData(): Stream[Arguments] = {
    Stream.of(
      of(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4), 6),
      of(Array(1), 1),
      of(Array(5, 4, -1, 7, 8), 23),
      of(Array(5, -3, 6, -7, 6), 8),
      of(Array(6, -7, 6, -3, 5), 8),
      of(Array(-2, -3, 4, -1, -2, 1, 5, -3), 7)
    )
  }
}
