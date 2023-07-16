import pytest
from typing import List
from src.main.java.problems.easy.DegreeOfAnArray.degree_of_an_array import Solution


test_data = [([1, 2, 2, 3, 1], 2), ([1, 2, 2, 3, 1, 4, 2], 6)]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_degree_of_an_subarray(input_array: List[int], expected_result: int):
    assert expected_result == Solution().findShortestSubArray(input_array)
