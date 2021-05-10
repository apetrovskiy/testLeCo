class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        print(f"str1 = {str1}, str2 = {str2}")
        if len(str1) < len(str2):
            if str1 in str2:
                return str1
        else:
            if str2 in str1:
                return str2
        return "-"

    def is_divisor_of(str1: str, str2: str) -> bool:
        return False
