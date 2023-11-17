package problems.easy.DegreeOfAnArray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Tags;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("epic Problems")
@Feature("feature Easy")
@Story("story Degree of an array")
@DisplayName("suite Scala")
class DegreeOfAnArrayScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  @Tags(Array(Tag("tag Scala")))
  @DisplayName("test Degree of an array")
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
