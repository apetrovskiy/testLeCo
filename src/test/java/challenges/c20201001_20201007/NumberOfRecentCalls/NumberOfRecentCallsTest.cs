namespace challenges.c20201001_20201007.NumberOfRecentCalls
{
    using System.Linq;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [AllureNUnit]
    public class RecentCounterTest
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void PingTest()
        {
            RecentCounter obj = new RecentCounter();
            var calls = new int[] { 1, 100, 3001, 3002 };
            calls.ToList().ForEach(call => obj.Ping(call));
            /*
            int t = 200;
            int param_1 = obj.Ping(t);
            */
        }
    }
}