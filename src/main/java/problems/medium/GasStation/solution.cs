// <copyright file="solution.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Problems.Medium.GasStation;

using System.Linq;

public class Solution
{
    public int CanCompleteCircuit(int[] gas, int[] cost)
    {
        var differences = Enumerable.Range(0, gas.Length)
        .Select(index => gas[index] - cost[index])
        .ToList();
        if (differences.Sum() < 0)
        {
            return -1;
        }

        var starting = 0;
        var tank = 0;
        for (var index = 0; index < gas.Length; index++)
        {
            tank = tank + gas[index] - cost[index];
            if (tank < 0)
            {
                starting = index + 1;
                tank = 0;
            }
        }

        return starting;
    }
}
