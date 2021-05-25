from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        min_number_needed = len(nums) // 2 + 1
        results = {}
        for i in range(len(nums)):
            if i in results.keys():
                results[i] += 1
            else:
                results[i] = 1
        # return max([x[0] for x in results if x[1] >= min_number_needed])
        for i in range(len(results)):
            if i.value >= min_number_needed:
                return i.key
        return 0
