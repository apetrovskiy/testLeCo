import allure
import pytest
from src.main.java.problems.easy.RomanToInteger.roman_to_integer import Solution


test_data = [
    ("", 0),
    ("III", 3),
    ("IV", 4),
    ("IX", 9),
    ("LVIII", 58),
    ("MCMXCIV", 1994),
    ("MDLXX", 1570),
    ("MMMDCCLXV", 3765),
]


@allure.epic("epic Problems")
@allure.feature("feature Easy")
@allure.story("story Roman to integer")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_roman_to_integer(input: str, expected_result: int):
    assert expected_result == Solution().romanToInt(input)
