from src.main.java.problems.medium.GasStation.solution3 import Solution
from typing import List
import allure
import pytest


test_data = [
    ([1, 2, 3, 4, 5], [3, 4, 5, 1, 2], 3),
    ([2, 3, 4], [3, 4, 3], -1),
    ([7, 1, 0, 11, 4], [5, 9, 1, 2, 5], 3),
]


@allure.epic("epic Problems")
@allure.feature("feature Medium")
@allure.story("story Gas station")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("gas,cost,expected_result", test_data)
def test_gas_station(gas: List[int], cost: List[int], expected_result: int):
    assert expected_result == Solution().canCompleteCircuit(gas, cost)
