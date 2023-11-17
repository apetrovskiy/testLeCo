package challenges.c20210101to20210107.CheckArrayFormationThroughConcatenation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Tags({@Tag("tag Java")})
@Epic("epic Challenges")
@Feature("feature 20210101-20210107")
@Story("story Check array formation through concatenation")
@DisplayName("suite Java")
class CheckArrayFormationThroughConcatenationTest {
    @Disabled
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags({@Tag("tag Java")})
    @DisplayName("test Check array formation through concatenation")
    void shouldCheck(int[] arr, int[][] pieces, boolean expectedResult) {
        final var actualResult = new Solution().canFormArray(arr, pieces);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
                of(new int[] {15, 88}, new int[][] {new int[] {88}, new int[] {15}}, true),
                of(new int[] {49, 18, 16}, new int[][] {new int[] {16, 18, 49}}, false),
                of(
                        new int[] {91, 4, 64, 78},
                        new int[][] {new int[] {78}, new int[] {4, 64}, new int[] {91}},
                        true),
                of(new int[] {1, 3, 5, 7}, new int[][] {new int[] {2, 4, 6, 8}}, false));
    }
}
