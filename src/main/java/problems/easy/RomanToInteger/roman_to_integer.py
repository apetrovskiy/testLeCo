class Solution:
    def romanToInt(self, s: str) -> int:
        self.result = 0
        s = self.calculate_part(
            s, one="I", half="V", next_digit="X", multiplier=1)
        s = self.calculate_part(
            s, one="X", half="L", next_digit="C", multiplier=10)
        s = self.calculate_part(
            s, one="C", half="D", next_digit="M", multiplier=100)
        if "MMM" in s:
            self.result += 3000
        elif "MM" in s:
            self.result += 2000
        elif "M" in s:
            self.result += 1000
        return self.result

    def calculate_part(
            self, s: str, one: str, half: str,
            next_digit: str, multiplier: int) -> str:
        if s is None or s == "":
            return ""
        if one + next_digit in s:
            self.result += 9 * multiplier
            return s.replace(one+next_digit, '')
        if half+one+one+one in s:
            self.result += 8 * multiplier
            return s.replace(half+one+one+one, '')
        elif half+one+one in s:
            self.result += 7 * multiplier
            return s.replace(half+one+one, '')
        elif half+one in s:
            self.result += 6 * multiplier
            return s.replace(half+one, '')
        elif one+half in s:
            self.result += 4 * multiplier
            return s.replace(one+half, '')
        elif half in s:
            self.result += 5 * multiplier
            return s.replace(half, '')
        elif one+one+one in s:
            self.result += 3 * multiplier
            return s.replace(one+one+one, '')
        elif one+one in s:
            self.result += 2 * multiplier
            return s.replace(one+one, '')
        elif one in s:
            self.result += 1 * multiplier
            return s.replace(one, '')
        else:
            return s
