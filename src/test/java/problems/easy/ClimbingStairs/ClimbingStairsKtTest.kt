package problems.easy.ClimbingStairs

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
@Story("story Climbing stairs")
@DisplayName("suite Kotlin")
class ClimbingStairsKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags(Tag("tag Kotlin"))
    @DisplayName("test Climbing stairs")
    fun testClimbingStairs(input: Int, expectedResult: Int) {
        assertEquals(expectedResult, ClimbingStairs().climbStairs(input))
    }

    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Stream.of(
                of(1, 1),
                of(2, 2),
                of(3, 3),
                of(4, 5),
                of(5, 8)
            )
        }
    }
}
