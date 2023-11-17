package problems.easy.DegreeOfAnArray;

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
@Story("story Degree of an array")
@DisplayName("suite Java")
class DegreeOfAnArrayTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags({@Tag("tag Java")})
    @DisplayName("test Degree of an array")
    void shouldCalculateDegree(int[] inputArray, int expectedResult) {
        assertEquals(expectedResult, new Solution().findShortestSubArray(inputArray));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(new int[] {1, 2, 2, 3, 1}, 2), of(new int[] {1, 2, 2, 3, 1, 4, 2}, 6));
    }
}
