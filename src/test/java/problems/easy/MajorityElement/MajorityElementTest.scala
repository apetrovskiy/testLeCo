package problems.easy.MajorityElement

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MajorityElementTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  def shouldCalculateMajorityElement(input: Array[Int], expectedResult: Int) = {
    assertEquals(expectedResult, SolutionScala.majorityElement(input))
  }
}

object MajorityElementTest {
  def getInputData(): Stream[Arguments] = {
    Stream.of(
      of(Array(3, 2, 3), 3),
      of(Array(2, 2, 1, 1, 1, 2, 2), 2)
    )
  }
}
