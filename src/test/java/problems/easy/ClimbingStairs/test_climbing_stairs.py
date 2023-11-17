import allure
import pytest
from src.main.java.problems.easy.ClimbingStairs.climbing_stairs import Solution


test_data = [(1, 1), (2, 2), (3, 3), (4, 5), (5, 8)]


@allure.epic("epic Problems")
@allure.feature("feature Easy")
@allure.story("story Climbing stairs")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_climbing_stairs(input: int, expected_result: int):
    assert expected_result == Solution().climbStairs(input)
