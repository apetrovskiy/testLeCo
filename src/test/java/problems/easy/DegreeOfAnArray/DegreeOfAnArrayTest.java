package problems.easy.DegreeOfAnArray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class DegreeOfAnArrayTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCalculateDegree(int[] inputArray, int expectedResult) {
        assertEquals(expectedResult, new Solution().findShortestSubArray(inputArray));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(new int[] { 1, 2, 2, 3, 1 }, 2), of(new int[] { 1, 2, 2, 3, 1, 4, 2 }, 6));
    }
}
