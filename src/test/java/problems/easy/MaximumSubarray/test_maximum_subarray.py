import allure
import pytest
from typing import List
from src.main.java.problems.easy.MaximumSubarray.maximum_subarray import Solution


test_data = [
    ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6),
    ([1], 1),
    ([5, 4, -1, 7, 8], 23),
    ([5, -3, 6, -7, 6], 8),
    ([6, -7, 6, -3, 5], 8),
    ([-2, -3, 4, -1, -2, 1, 5, -3], 7),
    ([-1], -1),
    ([-2, -1], -1),
]


@allure.epic("epic Problems")
@allure.feature("feature Easy")
@allure.story("story Maximum subarray")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_maximum_subarray(input_array: List[int], expected_result: int):
    assert expected_result == Solution().maxSubArray(input_array)
