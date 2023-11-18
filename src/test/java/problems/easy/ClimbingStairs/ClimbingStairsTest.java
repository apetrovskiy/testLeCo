package problems.easy.ClimbingStairs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Tags({@Tag("tag Java")})
@Epic("epic Problems")
@Feature("feature Easy")
@Story("story Climbing stairs")
@DisplayName("suite Java")
class ClimbingStairsTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags({@Tag("tag Java")})
    @DisplayName("test Climbing stairs")
    void testClimbingStairs(int input, int expectedResult) {
        assertEquals(expectedResult, new Solution().climbStairs(input));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(1, 1), of(2, 2), of(3, 3), of(4, 5), of(5, 8));
    }
}
