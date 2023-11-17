// <copyright file="ClimbingStairs.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Problems.Easy.ClimbingStairs
{
    public class Solution
    {
        public int ClimbStairs(int n)
        {
            if (n == 1)
            {
                return 1;
            }

            if (n == 2)
            {
                return 2;
            }

            var values = new int[n];
            values[0] = 1;
            values[1] = 2;
            for (var i = 2; i < n; i++)
            {
                values[i] = values[i - 1] + values[i - 2];
            }

            return values[n - 1];
        }
    }
}