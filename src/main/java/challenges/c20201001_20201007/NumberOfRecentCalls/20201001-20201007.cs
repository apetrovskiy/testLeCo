namespace challenges.c20201001_20201007.NumberOfRecentCalls
{
    using System;
    using System.Collections.Generic;

    public class RecentCounter
    {
        private const int MaximumTime = 3000;
        private int counter;
        private List<int> requests;
        public RecentCounter()
        {
            counter = 0;
            requests = new List<int>();
        }

        public int Ping(int t)
        {
            requests.Add(t);
            var sum = 0;
            counter = 0;
            for (var i = requests.Count - 1; i >= 0; i--)
            {
                sum += requests[i];
                Console.WriteLine($"req -> {requests[i]}");
                counter++;
                Console.WriteLine($"counter -> {counter}");
                if (MaximumTime <= sum)
                {
                    break;
                }
            }
            return counter;
        }
    }

}