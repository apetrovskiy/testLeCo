from typing import List


class Solution:
    def mostCompetitive(self, nums: List[int], k: int) -> List[int]:
        result = []
        max_diff = 0
        print(f"loop from 0 to {len(nums) - k}")
        for index in range(len(nums) - k + 1):
            current_diff = nums[index + k - 1] - nums[index]
            
            print(f"index = {index}")
            print(f"nums[index + k - 1] - nums[index] = {nums[index + k - 1] - nums[index]}")
            print(f"current_diff = {current_diff}")
            print(f"max_diff = {max_diff}")
            print(f"result = {nums[index:index + k - 1]}")
            
            if current_diff > max_diff:
                result = nums[index:index + k]
        return result
