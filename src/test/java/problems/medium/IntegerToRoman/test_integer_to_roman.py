import allure
import pytest
from src.main.java.problems.medium.IntegerToRoman.integer_to_roman import Solution


test_data = [
    (0, ""),
    (1, "I"),
    (3, "III"),
    (4, "IV"),
    (9, "IX"),
    (58, "LVIII"),
    (1994, "MCMXCIV"),
    (3999, "MMMCMXCIX"),
    (1000, "M"),
]


@allure.epic("epic Problems")
@allure.feature("feature Medium")
@allure.story("story Integer to roman")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_integer_to_roman(input: int, expected_result: str):
    assert expected_result == Solution().intToRoman(input)
