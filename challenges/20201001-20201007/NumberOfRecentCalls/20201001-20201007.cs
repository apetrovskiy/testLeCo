using System;
using System.Collections.Generic;
using System.Linq;
using NUnit.Framework;

namespace Tests
{
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
            var sum = 0;
            counter = 0;
            for (var i = requests.Count - 1; i >= 0; i --) {
                sum += requests[i];
                Console.WriteLine($"req -> {requests[i]}");
                counter++;
                Console.WriteLine($"counter -> {counter}");
                if (MaximumTime <= sum) {
                    break;
                }
            }
            return counter;
        }
    }
    public class RecentCounterTest
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void PingTest() {
            RecentCounter obj = new RecentCounter();
            var calls = new int[] {1, 100, 3001, 3002};
            calls.ToList().ForEach(call => obj.Ping(call));
            /*
            int t = 200;
            int param_1 = obj.Ping(t);
            */
        }
    }
}