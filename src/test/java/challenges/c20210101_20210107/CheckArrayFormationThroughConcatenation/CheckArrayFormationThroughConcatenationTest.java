package challenges.c20210101_20210107.CheckArrayFormationThroughConcatenation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CheckArrayFormationThroughConcatenationTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCheck(int[] arr, int[][] pieces, boolean expectedResult) {
        final var actualResult = new Solution().canCompleteCircuit(arr, pieces);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getInputData() {
        return Stream
                .of(of(new int[] { 15, 88 }, new int[][] { new int[] { 88 }, new int[] { 15 } }, true),
                        of(new int[] { 49, 18, 16 }, new int[][] { new int[] { 16, 18, 49 } }, false),
                        of(new int[] { 91, 4, 64, 78 },
                                new int[][] { new int[] { 78 }, new int[] { 4, 64 }, new int[] { 91 } }, true),
                        of(new int[] { 1, 3, 5, 7 }, new int[][] { new int[] { 2, 4, 6, 8 } }, false));
    }
}