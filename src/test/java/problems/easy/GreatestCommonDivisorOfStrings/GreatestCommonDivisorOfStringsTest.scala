package problems.easy.GreatestCommonDivisorOfStrings
import java.util
import org.junit.jupiter.api.Assertions.{assertAll, assertEquals}
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.{Arguments, MethodSource}

class GreatestCommonDivisorOfStringsScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  def shouldFindGreatestCommonDivisorScala(
      str1: String,
      str2: String,
      expectedResult: String
  ) = {
    assertEquals(SolutionScala.gcdOfStrings(str1, str2), expectedResult)
  }
}

object GreatestCommonDivisorOfStringsTest {
  def getInputData(): java.util.stream.Stream[Arguments] = {
    java.util.stream.Stream.of(
      of("ABCABC", "ABC", "ABC"),
      of("ABABAB", "ABAB", "AB"),
      of("LEET", "CODE", ""),
      of("ABCDEF", "ABC", "")
    )
  }
}
