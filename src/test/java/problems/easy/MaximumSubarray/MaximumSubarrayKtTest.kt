package problems.easy.MaximumSubarray

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@Epic("epic Problems")
@Feature("feature Easy")
@Story("story Maximum subarray")
@DisplayName("suite Kotlin")
class MaximumSubarrayKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags(Tag("tag Kotlin"))
    @DisplayName("test Maximum subarray")
    fun shouldCalculateMaximumSubarray(inputArray: IntArray, expectedResult: Int) {
        assertEquals(expectedResult, MaximumSubarray().maxSubArray(inputArray))
    }

    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Stream.of(
                of(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4), 6),
                of(intArrayOf(1), 1),
                of(intArrayOf(5, 4, -1, 7, 8), 23),
                of(intArrayOf(5, -3, 6, -7, 6), 8),
                of(intArrayOf(6, -7, 6, -3, 5), 8),
                of(intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3), 7),
                of(intArrayOf(-1), 1),
                of(intArrayOf(-2, -1), 1)
            )
        }
    }
}
