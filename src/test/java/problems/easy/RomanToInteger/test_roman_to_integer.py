import pytest
from src.main.java.problems.easy.RomanToInteger.roman_to_integer \
    import Solution


test_data = [
    ('', 0),
    ('III', 3),
    ('IV', 4),
    ('IX', 9),
    ('LVIII', 58),
    ('MCMXCIV', 1994),
    ('MDLXX', 1570),
    ('MMMDCCLXV', 3765)
]


@pytest.mark.parametrize("input,expected_result", test_data)
def test_roman_to_integer(input: str, expected_result: int):
    assert expected_result == Solution().romanToInt(input)
