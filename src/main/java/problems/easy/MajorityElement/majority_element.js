/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
  let minNumberNeeded = Math.floor(nums.length / 2) + 1;
  let results = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (results.has(nums[i])) {
      results.set(nums[i], results.get(nums[i]) + 1);
    } else {
      results.set(nums[i], 1);
    }
  }
  for (let [key, value] of results) {
    if (value >= minNumberNeeded) {
      return key;
    }
  }
  return 0;
};

module.exports = { majorityElement };
