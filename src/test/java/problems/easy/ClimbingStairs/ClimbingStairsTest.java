package problems.easy.ClimbingStairs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class ClimbingStairsTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void testClimbingStairs(int input, int expectedResult) {
        assertEquals(expectedResult, new Solution().climbStairs(input));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(1, 1), of(2, 2), of(3, 3), of(4, 5), of(5, 8));
    }
}