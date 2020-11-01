using System.Collections.Generic;
using NUnit.Framework;
/*
public class RecentCounter {
    private const int MaximumTime = 3000;
    private int counter;
    private List<int> requests;
    public RecentCounter() {
        counter = 0;
        requests = new List<int>();
    }
    
    public int Ping(int t) {
        requests.Add(t);
        var sum = t;
        counter = 1;
        for (var i = requests.Count - 2; i >= 0; i --) {
            sum += requests[i];
            counter++;
            if (MaximumTime <= sum) {
                break;
            }
        }
        return counter;
    }
}
*/
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.Ping(t);
 */
 
/*
public class RecentCounterTest {
    [Test]
    public void PingTest() {
        RecentCounter obj = new RecentCounter();
        int t = 200;
        int param_1 = obj.Ping(t);
    }
}
*/