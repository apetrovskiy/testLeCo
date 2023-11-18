package problems.easy.MaximumSubarray

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

@Epic("epic Problems")
@Feature("feature Easy")
@Story("story Maximum subarray")
@DisplayName("suite Scala")
class MaximumSubarrayScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  @Tags(Array(Tag("tag Scala")))
  @DisplayName("test Maximum subarray")
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
      of(Array(-2, -3, 4, -1, -2, 1, 5, -3), 7),
      of(Array(-1), -1),
      of(Array(-2, -1), -1)
    )
  }
}
