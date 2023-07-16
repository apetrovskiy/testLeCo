from typing import List


class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result: List[List[int]] = []
        candidates.sort()
        candidates.reverse()
        if target % candidates[0] == 0:
            temp_result = []
            print("-------------------------")
            print(int(target / candidates[0]))
            for i in range(int(target / candidates[0])):
                print("====================")
                print(i)
                temp_result.append(int(i))
            result.append(temp_result)
        return result
