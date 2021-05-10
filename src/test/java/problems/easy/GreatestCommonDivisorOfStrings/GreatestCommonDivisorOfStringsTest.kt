package problems.easy.GreatestCommonDivisorOfStrings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.MethodSource
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class GreatestCommonDivisorOfStringsTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    fun shouldFindGreatesCommonDivisor(str1: String, str2: String, expectedResult: String) {
        val solution = SolutionKt()
        assertEquals()
    }

    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Steram.of(
                of("ABCABC", "ABC", "ABC"),
                of("ABABAB", "ABAB", "AB"),
                of("LEET", "CODE", ""),
                of("ABCDEF", "ABC", "")
            )
        }
    }
}