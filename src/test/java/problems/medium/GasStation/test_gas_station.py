from typing import List
import pytest


test_data = []


@pytest.mark.parametrize("gas,cost,expected_result", test_data)
def test_gas_station(gas: List[int], cost: List[int], expected_result: int]]):
    assert expected_result == canCompleteCircuit(gas, cost, expected_result)
