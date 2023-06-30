package problems.easy.MaximumSubarray;

@SuppressWarnings("PMD")
class Solution {
    public int maxSubArray(int[] nums) {
        var currentMaximum = Integer.MIN_VALUE;
        var maximumAtTheEnd = 0;
        for (var i = 0; i < nums.length; i++) {
            maximumAtTheEnd += nums[i];
            currentMaximum = maximumAtTheEnd > currentMaximum ? maximumAtTheEnd : currentMaximum;
            maximumAtTheEnd = maximumAtTheEnd < 0 ? 0 : maximumAtTheEnd;
        }
        return currentMaximum;
    }
}
