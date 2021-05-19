package problems.easy.MaximumSubarray;

import java.util.Arrays;

@SuppressWarnings("PMD")
class Solution {
    public int maxSubArray(int[] nums) {
        return Arrays.stream(nums).reduce(0, (subtotal, next) -> Math.max(0, subtotal + next));
//        return Arrays.stream(nums).collect((subtotal,next)->Math.max(0, subtotal+next));
    }
}
