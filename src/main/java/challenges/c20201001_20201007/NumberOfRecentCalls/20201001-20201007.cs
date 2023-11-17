// <copyright file="20201001-20201007.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Challenges.C20201001_20201007.NumberOfRecentCalls
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
            this.counter = 0;
            this.requests = new List<int>();
        }

        public int Ping(int t)
        {
            this.requests.Add(t);
            var sum = 0;
            this.counter = 0;
            for (var i = this.requests.Count - 1; i >= 0; i--)
            {
                sum += this.requests[i];
                Console.WriteLine($"req -> {this.requests[i]}");
                this.counter++;
                Console.WriteLine($"counter -> {this.counter}");
                if (sum >= MaximumTime)
                {
                    break;
                }
            }

            return this.counter;
        }
    }
}