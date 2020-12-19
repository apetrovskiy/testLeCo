package challenges.c20201001_20201007.NumberOfRecentCalls;

public class NumberOfRecentCallsTest {
    @Test
    void testNumberOfRecentCalls() {
        final RecentCounter recentCounter = new RecentCounter();
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }
}
