/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
  let currentMaximum = Number.MIN_SAFE_INTEGER;
  let maximumAtTheEnd = 0;
  for (let i = 0; i < nums.length; i++) {
    maximumAtTheEnd += nums[i];
    currentMaximum =
      currentMaximum < maximumAtTheEnd ? maximumAtTheEnd : currentMaximum;
    maximumAtTheEnd = maximumAtTheEnd < 0 ? 0 : maximumAtTheEnd;
  }
  return currentMaximum;
};

module.exports = { maxSubArray };
