from src.main.java.challenges.c20201001_20201007.CombinationSum.solution \
    import Solution
import unittest


class SolutionTest(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_1(self):
        actual_result = self.solution.combinationSum(
            candidates=[2, 3, 6, 7], target=8)
        print(actual_result)
        self.assertEquals([[2, 2, 3], [7]], actual_result)

    def test_2(self):
        actual_result = self.solution.combinationSum(
            candidates=[2, 3, 5], target=8)
        print(actual_result)
        self.assertEquals([[2, 2, 2, 2], [2, 3, 3], [3, 5]], actual_result)

    def test_3(self):
        actual_result = self.solution.combinationSum(candidates=[2], target=1)
        print(actual_result)
        self.assertEquals([], actual_result)

    def test_4(self):
        actual_result = self.solution.combinationSum(candidates=[1], target=1)
        print(actual_result)
        self.assertEquals([[1]], actual_result)

    def test_5(self):
        actual_result = self.solution.combinationSum(candidates=[1], target=2)
        print(actual_result)
        self.assertEquals([[1, 1]], actual_result)
