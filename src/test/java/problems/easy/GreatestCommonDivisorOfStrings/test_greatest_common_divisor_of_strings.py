import pytest
from src.main.java.problems.easy.GreatestCommonDivisorOfStrings. \
    greatest_common_divisor_of_strings import Solution


test_data = [
    ("ABCABC", "ABC", "ABC"),
    ("ABABAB", "ABAB", "AB"),
    ("LEET", "CODE", ""),
    ("ABCDEF", "ABC", "")
]


@pytest.mark.parametrize("str1,str2,expected_result", test_data)
def test_greatest_common_divisor_of_strings(str1: str, str2: str, expected_result: str):
    assert expected_result == Solution().gcdOfStrings(str1, str2)
