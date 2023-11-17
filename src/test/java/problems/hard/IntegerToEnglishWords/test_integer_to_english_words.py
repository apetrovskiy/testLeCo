import allure
import pytest
from src.main.java.problems.hard.IntegerToEnglishWords.integer_to_english_words import (
    Solution,
)


test_data = [
    (0, Solution().ZERO),
    (1, Solution().ONE),
]


@allure.epic("epic Problems")
@allure.feature("feature Hard")
@allure.story("story Integer to English words")
@allure.parent_suite("suite Python")
@allure.title("test Python")
@allure.tag("tag Python")
@pytest.mark.parametrize("input,expected_result", test_data)
def test_integer_to_english_words(input: int, expected_result: str):
    assert expected_result == Solution().numberToWords(input)
