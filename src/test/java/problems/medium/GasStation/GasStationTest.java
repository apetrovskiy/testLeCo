package problems.medium.GasStation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
// import problems.medium.GasStation.SolutionSc;

class GasStationTest {
  @ParameterizedTest
  @MethodSource("getInputData")
  void TestGasStation(int[] gas, int[] cost, int expectedResult) {
    final var actualResult = new Solution().canCompleteCircuit(gas, cost);
    assertEquals(expectedResult, actualResult);
  }

  @ParameterizedTest
  @MethodSource("getInputData")
  void TestGasStationKt(int[] gas, int[] cost, int expectedResult) {
    final var actualResult = new SolutionKt().canCompleteCircuit(gas, cost);
    assertEquals(expectedResult, actualResult);
  }

  /*
  @ParameterizedTest
  @MethodSource("getInputData")
  void TestGasStationScala(int[] gas, int[] cost, int expectedResult) {
      final var actualResult = SolutionSc.canCompleteCircuit(gas, cost);
      assertEquals(expectedResult, actualResult);
  }
  */

  static Stream<Arguments> getInputData() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}, 3),
        of(new int[] {2, 3, 4}, new int[] {3, 4, 3}, -1),
        of(new int[] {7, 1, 0, 11, 4}, new int[] {5, 9, 1, 2, 5}, 3));
  }
}
