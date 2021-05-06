class Solution:
    def intToRoman(self, num: int) -> str:
        result: str = ""
        result = self.calculate_digit_string(num % 10, 1)
        result = self.calculate_digit_string(num % 100 - num % 10, 10) + result
        result = self.calculate_digit_string(
            num % 1000 - num % 100, 100) + result
        if num >= 3000:
            result = 'MMM'+result
        elif num >= 2000:
            result = 'MM'+result
        elif num >= 1000:
            result = 'M'+result
        return result

    def calculate_digit_string(self, num: int, multiplier: int) -> str:
        num /= multiplier
        one = "C" if multiplier == 100 else self.one_or_ten(multiplier)
        half = "D" if multiplier == 100 else self.five_or_fifty(multiplier)
        ten = "M" if multiplier == 100 else self.ten_or_hundred(multiplier)
        result = ""
        if num == 1:
            result = one
        elif num == 2:
            result = one+one
        elif num == 3:
            result = one+one+one
        elif num == 4:
            result = one+half
        elif num == 5:
            result = half
        elif num == 6:
            result = half+one
        elif num == 7:
            result = half+one+one
        elif num == 8:
            result = half+one+one+one
        elif num == 9:
            result = one+ten
        return result

    def one_or_ten(self, multiplier: int) -> str:
        return 'X' if multiplier == 10 else 'I'

    def five_or_fifty(self, multiplier: int) -> str:
        return 'L' if multiplier == 10 else 'V'

    def ten_or_hundred(self, multiplier: int) -> str:
        return 'C' if multiplier == 10 else 'X'
