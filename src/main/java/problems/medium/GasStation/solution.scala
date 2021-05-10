package problems.medium.GasStation

object SolutionSc {
  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    val differences = Range(0, gas.size - 1)
      .map(index => gas(index) - cost(index))
    if (differences.foldLeft(0)(_ + _) < 0)
      -1

    var starting = 0
    var tank = 0
    for (index <- 0 to gas.size - 1) {
      tank = tank + gas(index) - cost(index)
      if (tank < 0) {
        starting = index + 1
        tank = 0
      }
    }

    starting
  }
}
