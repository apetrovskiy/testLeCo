import pytest
from src.main.java.problems.easy.ClimbingStairs.climbing_stairs import Solution


test_data = [(1, 1), (2, 2), (3, 3), (4, 5), (5, 8)]


@pytest.mark.parametrize("input,expected_result", test_data)
def test_climbing_stairs(input: int, expected_result: int):
    assert expected_result == Solution().climbStairs(input)
