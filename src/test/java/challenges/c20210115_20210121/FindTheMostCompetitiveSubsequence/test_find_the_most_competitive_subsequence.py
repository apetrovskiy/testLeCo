from src.main.java.challenges.c20210115_20210121.\
    FindTheMostCompetitiveSubsequence.solution3 import Solution
from typing import List
import pytest


test_data = [
    ([3, 5, 2, 6], 2, [2, 6]),
    ([2, 4, 3, 3, 5, 4, 9, 6], 4, [2, 3, 3, 4])
]


@pytest.mark.parametrize("nums,k,expected_result", test_data)
def test_most_competitive(nums: List[int], k: int, expected_result: List[int]):
    assert expected_result == Solution().mostCompetitive(nums, k)
