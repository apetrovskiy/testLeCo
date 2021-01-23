from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = [[x, y] for x in range(len(nums)) for y in range(
            len(nums)) if nums[x] + nums[y] == target and x != y]
        return result[0]
