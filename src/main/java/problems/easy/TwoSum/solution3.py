from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # result = [[x, y] for x in range(len(nums)) for y in range(
        #     len(nums)) if nums[x] + nums[y] == target and x != y]
        # return result[0]

        # with some ideas
        # result = [[x, y] for x in range(len(nums)) for y in range(
        #     x + 1, len(nums)) if nums[x] + nums[y] == target]
        # return result[0]

        sorted = nums
        sorted.sort()
        result = [[sorted[x], sorted[y]] for x in range(len(sorted)) for y in range(
            len(sorted) - 1, 0, -1) if sorted[x] + sorted[y] == target and x < y]
        return [nums.index[result[0]], nums.index[result[1]]]
