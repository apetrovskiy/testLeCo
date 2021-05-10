class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        result: str = ""
        max_divisor_length = min(len(str1), len(str2))
        current_divisor: str = ""
        for i in range(0, max_divisor_length):
            current_divisor += str1[i]
            if self.is_divisor_of(current_divisor, str1) and self.is_divisor_of(current_divisor, str2):
                result = current_divisor
        return result

    def is_divisor_of(self, divisor: str, data: str) -> bool:
        result: bool = False
        if len(divisor) > len(data):
            return result
        if divisor == data:
            return True
        list_from_str2 = data.split(divisor)
        result = all(x == '' for x in list_from_str2)
        return result
