from src.main.java.problems.easy.TwoSum.solution3 import Solution
from typing import List
import pytest


test_data = [([2, 7, 11, 15], 9, [0, 1]), ([3, 2, 4], 6, [1, 2]), ([3, 3], 6, [0, 1])]


@pytest.mark.parametrize("nums,target,expected_result", test_data)
def test_two_sum(nums: List[int], target: int, expected_result: List[int]):
    assert expected_result == Solution().twoSum(nums, target)
