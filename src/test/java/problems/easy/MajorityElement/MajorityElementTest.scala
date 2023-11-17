package problems.easy.MajorityElement

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
@Story("story Majority element")
@DisplayName("suite Scala")
class MajorityElementTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  @Tags(Array(Tag("tag Scala")))
  @DisplayName("test Majority element")
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
