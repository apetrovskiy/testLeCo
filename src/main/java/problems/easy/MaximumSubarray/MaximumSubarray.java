package problems.easy.MaximumSubarray;

import java.util.Arrays;

@SuppressWarnings("PMD")
class Solution {
    public int maxSubArray(int[] nums) {
        // return Arrays.stream(nums).reduce(0, (subtotal, next) -> Math.max(0, subtotal
        // + next));
        // return Arrays.stream(nums).collect((subtotal,next)->Math.max(0,
        // subtotal+next));
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
