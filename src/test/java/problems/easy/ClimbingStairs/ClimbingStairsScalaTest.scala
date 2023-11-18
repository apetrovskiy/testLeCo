package problems.easy.ClimbingStairs

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
@Story("story Climbing stairs")
@DisplayName("suite Scala")
class ClimbingStairsScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  @Tags(Array(Tag("tag Scala")))
  @DisplayName("test Climbing stairs")
  def testClimbingStairs(input: Int, expectedResult: Int) = {
    assertEquals(expectedResult, SolutionScala.climbStairs(input))
  }
}

object ClimbingStairsScalaTest {
  def getInputData(): Stream[Arguments] = {
    Stream.of(
      of(1, 1),
      of(2, 2),
      of(3, 3),
      of(4, 5),
      of(5, 8)
    )
  }
}
