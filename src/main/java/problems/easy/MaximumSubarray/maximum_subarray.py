from typing import List
from sys import maxsize


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        current_max = -maxsize - 1
        current_max_plus_next = 0
        for i in range(len(nums)):
            current_max_plus_next += nums[i]
            if current_max < current_max_plus_next:
                current_max = current_max_plus_next
            if current_max_plus_next < 0:
                current_max_plus_next = 0
        return current_max
