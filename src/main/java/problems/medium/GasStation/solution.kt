package problems.medium.GasStation

class SolutionKt {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val differences = IntRange(0, gas.size - 1)
        .map {index -> gas[index] - cost[index]}
        if (differences.sum() < 0)
            return -1

        var starting = 0
        var tank = 0
        for (index in 0..gas.size - 1)
        {
            tank = tank + gas[index] - cost[index]
            if (tank < 0)
            {
                starting = index + 1
                tank = 0
            }
        }

        return starting
    }
}
