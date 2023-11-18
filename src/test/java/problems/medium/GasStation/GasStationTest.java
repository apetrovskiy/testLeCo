package problems.medium.GasStation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
// import problems.medium.GasStation.SolutionSc;

@Tags({@Tag("tag Java")})
@Epic("epic Problems")
@Feature("feature Easy")
@Story("story Gas station")
@DisplayName("suite Java")
class GasStationTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags({@Tag("tag Java")})
    @DisplayName("test Gas station 01")
    void TestGasStation(int[] gas, int[] cost, int expectedResult) {
        final var actualResult = new Solution().canCompleteCircuit(gas, cost);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags({@Tag("tag Java")})
    @DisplayName("test Gas station 02")
    void TestGasStationKt(int[] gas, int[] cost, int expectedResult) {
        final var actualResult = new SolutionKt().canCompleteCircuit(gas, cost);
        assertEquals(expectedResult, actualResult);
    }

    /*
    @ParameterizedTest
    @MethodSource("getInputData")
        @Tags({@Tag("tag Java")})
    @DisplayName("test Gas station 03y")
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
