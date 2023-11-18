package problems.easy.DegreeOfAnArray

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
@Story("story Degree of an array")
@DisplayName("suite Kotlin")
class DegreeOfAnArrayKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags(Tag("tag Kotlin"))
    @DisplayName("test Degree of an array")
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
