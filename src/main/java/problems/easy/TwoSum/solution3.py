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

        # print(f"input = {nums}")
        # sorted = nums.copy()
        # sorted.sort()
        # result = [[sorted[x], sorted[y]] for x in range(len(sorted)) for y in range(
        #     len(sorted) - 1, 0, -1) if sorted[x] + sorted[y] == target and x < y]
        # print(f"result: {result}")
        # print(f"what to find {result[0][0]}")
        # print(f"index = {nums.index(result[0][0])}")
        # print([nums.index(result[0][0]), nums.index(result[0][1])])
        # print(nums)
        # return [nums.index(result[0][0]), nums.index(result[0][1])]

        sorted = nums.copy()
        sorted.sort()
        i = 0
        j = len(sorted) - 1
        while i < j:
            if sorted[i] + sorted[j] == target:
                if sorted[i] != sorted[j]:
                    return [nums.index(sorted[i]), nums.index(sorted[j])]
                else:
                    index1 = nums.index(sorted[i])
                    index2 = nums.index(sorted[j], index1 + 1)
                    return [index1, index2]
            elif sorted[i] + sorted[j] < target:
                i += 1
            elif sorted[i] + sorted[j] > target:
                j -= 1
        return []
