/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    let result = [
        []
    ];
    candidates.sort();
    candidates.reverse();
    if (target % candidates[0]) {
        let tempResult = [];
        for (let i = 0; i < Math.floor(target / candidates[0]); i++) {
            tempResult.push(i);
        }
        result.push(tempResult);
    }
    return result;
};

module.exports = {
    combinationSum
}