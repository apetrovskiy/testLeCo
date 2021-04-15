from src.main.java.problems.easy.IsSubsequence.solution3 import Solution
import pytest


test_data = [
    ("abc", "ahbgdc", True),
    ("axc", "ahbgdc", False)
]


@pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("s,t,expected_result", test_data)
def test_is_subsequence(s: str, t: str, expected_result: bool):
    assert expected_result == Solution().isSubsequence(s, t)
