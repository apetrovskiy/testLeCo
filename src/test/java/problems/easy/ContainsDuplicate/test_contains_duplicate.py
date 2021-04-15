from src.main.java.problems.easy.ContainsDuplicate.solution3 import Solution
from typing import List
import pytest

test_data = [
    ([1, 2, 3, 1], True),
    ([1, 2, 3, 4], False),
    ([1, 1, 1, 3, 3, 4, 3, 2, 4, 2], True)
]


@pytest.mark.parametrize("input,expected_result", test_data)
def test_contains_duplicate(input: List[int], expected_result: bool):
    assert expected_result == Solution().containsDuplicate(input)
