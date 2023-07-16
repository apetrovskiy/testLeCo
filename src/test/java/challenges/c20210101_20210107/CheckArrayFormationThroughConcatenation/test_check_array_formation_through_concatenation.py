import pytest
from typing import List
from src.main.java.challenges.c20210101_20210107.CheckArrayFormationThroughConcatenation.solution import (
    Solution,
)


test_data = [
    ([85], [[85]], True),
    ([15, 88], [[88], [15]], True),
    ([49, 18, 16], [[16, 18, 49]], False),
    ([91, 4, 64, 78], [[78], [4, 64], [91]], True),
    ([1, 3, 5, 7], [[2, 4, 6, 8]], False),
]


@pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("input_array,pieces,expected_result", test_data)
def test_check_array_formation_through_concatenation(
    input_array: List[int], pieces: List[List[int]], expected_result: bool
):
    assert expected_result == Solution().canFormArray(input_array, pieces)
