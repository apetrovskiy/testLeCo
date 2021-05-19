package problems.easy.MaximumSubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class MaximumSubarrayTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCalculate(int[] inputArray, int expectedResult) {
        assertEquals(expectedResult, new Solution().maxSubArray(inputArray));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }, 6), of(new int[] { 1 }, 1),
                of(new int[] { 5, 4, -1, 7, 8 }, 23),

                of(new int[] { 5, -3, 6, -7, 6 }, 8), of(new int[] { 6, -7, 6, -3, 5 }, 8),

                of(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }, 7),of(new int[] { -1 }, -1),of(new int[]{-2,-1},-1));
    }
}