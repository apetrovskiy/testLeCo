package problems.easy.ClimbingStairs
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
class ClimbingStairsKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
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
