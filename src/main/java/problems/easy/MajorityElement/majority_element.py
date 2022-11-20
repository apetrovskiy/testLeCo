from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        min_number_needed = len(nums) // 2 + 1
        results = {}
        for i in range(len(nums)):
            if nums[i] in results.keys():
                results[nums[i]] += 1
            else:
                results[nums[i]] = 1
        return [k for (k, v) in results.items() if v >= min_number_needed][0]
