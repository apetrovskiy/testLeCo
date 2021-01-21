/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let differences = new Array(gas.length);
    for (let i = 0; i < gas.length; i++) {
        differences[i] = gas[i] - cost[i];
    }

    if (differences.reduce((sum, current) => sum + current, 0) < 0)
        return -1;
    let starting = 0;
    let tank = 0;
    for (let i = 0; i < gas.length; i++) {
        tank = tank + gas[i] - cost[i];
        if (tank < 0) {
            starting = i + 1;
            tank = 0;
        }
    }

    return starting;
};