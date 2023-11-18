import allure
import pytest
from typing import List
from src.main.java.problems.easy.MajorityElement.majority_element import Solution


test_data = [([3, 2, 3], 3), ([2, 2, 1, 1, 1, 2, 2], 2)]


@allure.epic("epic Problems")
@allure.feature("feature Easy")
@allure.story("story Majority element")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_majority_element(input_array: List[int], expected_result: int):
    assert expected_result == Solution().majorityElement(input_array)
