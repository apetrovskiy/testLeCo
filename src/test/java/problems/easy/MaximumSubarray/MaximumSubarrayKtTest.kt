package problems.easy.MaximumSubarray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MaximumSubarrayKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    fun shouldCalculateMaximumSubarray(inputArray: IntArray, expectedResult: Int) {
        assertEquals(expectedResult, SolutionKt().maxSubArray(inputArray))
    }

    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Stream.of(
                of(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4), 6),
                of(arrayOf(1), 1),
                of(arrayOf(5, 4, -1, 7, 8), 23),
                of(arrayOf(5, -3, 6, -7, 6), 8),
                of(arrayOf(6, -7, 6, -3, 5), 8),
                of(arrayOf(-2, -3, 4, -1, -2, 1, 5, -3), 7),
                of(arrayOf(-1), 1)
            )
        }
    }
}
