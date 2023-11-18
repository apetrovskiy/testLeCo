package challenges.c20201001to20201007.NumberOfRecentCalls;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({@Tag("tag Java")})
@Epic("epic Challenges")
@Feature("feature 20201001-20201007")
@Story("story Number of recent calls")
@DisplayName("suite Java")
@SuppressWarnings("PMD")
public class NumberOfRecentCallsTest {
    @Test
    @Tags({@Tag("tag Java")})
    @DisplayName("test Number of recent calls")
    void testNumberOfRecentCalls() {
        final RecentCounter recentCounter = new RecentCounter();
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }
}
