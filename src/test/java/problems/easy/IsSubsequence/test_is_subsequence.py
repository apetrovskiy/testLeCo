from src.main.java.problems.easy.IsSubsequence.solution3 import Solution
import allure
import pytest


test_data = [("abc", "ahbgdc", True), ("axc", "ahbgdc", False)]


@allure.epic("epic Problems")
@allure.feature("feature Easy")
@allure.story("story Is subsequence")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("s,t,expected_result", test_data)
def test_is_subsequence(s: str, t: str, expected_result: bool):
    assert expected_result == Solution().isSubsequence(s, t)
