package problems.easy.DegreeOfAnArray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class DegreeOfAnArrayKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    fun testDegreeOfAnArray(inputArray: IntArray, expectedResult: Int) {
        assertEquals(expectedResult, DegreeOfAnArray().findShortestSubArray(inputArray))
    }

    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Stream.of(
                of(intArrayOf(1, 2, 2, 3, 1), 2),
                of(intArrayOf(1, 2, 2, 3, 1, 4, 2), 6)
            )
        }
    }
}
