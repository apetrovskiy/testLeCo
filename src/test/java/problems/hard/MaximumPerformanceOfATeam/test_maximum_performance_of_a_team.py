import pytest
from typing import List
from src.main.java.problems.hard.MaximumPerformanceOfATeam. \
    maximum_performance_of_a_team import Solution


test_data = [

]


@pytest.mark.parametrize(
    "num_of_eng,speed,efficiency,team_size,expected_result", test_data)
def test_max_performance_of_a_team(
        num_of_eng: int, speed: List[int],
        efficiency: List[int], team_size: int, expected_result):
    assert expected_result == Solution().maxPerformance(
        num_of_eng, speed, efficiency, team_size)
