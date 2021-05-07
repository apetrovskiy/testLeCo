package problems.medium.GasStation;

import java.util.stream.IntStream;

class Solution {
    @SuppressWarnings("PMD")
    public int canCompleteCircuit(int[] gas, int[] cost) {
        var differences = IntStream.range(0, gas.length).map(index -> gas[index] - cost[index]);
        if (differences.sum() < 0)
            return -1;

        var starting = 0;
        var tank = 0;
        for (var index = 0; index < gas.length; index++) {
            tank = tank + gas[index] - cost[index];
            if (tank < 0) {
                starting = index + 1;
                tank = 0;
            }
        }

        return starting;
    }
}
