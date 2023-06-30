package problems.easy.DegreeOfAnArray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class DegreeOfAnArrayScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  def shouldCalculateDegree(inputArray: Array[Int], expectedResult: Int) = {
    assertEquals(expectedResult, SolutionScala.findShortestSubArray(inputArray))
  }
}

object DegreeOfAnArrayScalaTest {
  def getInputData(): Stream[Arguments] = {
    Stream.of(
      of(Array(1, 2, 2, 3, 1), 2),
      of(Array(1, 2, 2, 3, 1, 4, 2), 6)
    )
  }
}
