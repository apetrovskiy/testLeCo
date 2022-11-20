/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if (1 == n) {
        return 1;
    }
    if (2 == n) {
        return 2;
    }
    // let values = new Array(n);
    let values = Array(n).fill(-1);
    values[0] = 1;
    values[1] = 2;
    for (let i = 2; i < n; i++) {
        values[i] = values[i - 1] + values[i - 2];
    }
    return values[n - 1];
};

module.exports = { climbStairs };