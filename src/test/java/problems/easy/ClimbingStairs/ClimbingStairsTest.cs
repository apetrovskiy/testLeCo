namespace problems.easy.ClimbingStairs
{
    using System.Collections.Generic;
    using NUnit.Framework;
    public class ClimbingStairsTest
    {
        [Test, TestCaseSource("GetInputData")]
        public void ShouldCalculateStairs(int input, int expectedResult)
        {
            Assert.AreEqual(expectedResult, new Solution().ClimbStairs(input));
        }
        public static IEnumerable<TestCaseData> GetInputData()
        {
            yield return new TestCaseData(1, 1);
            yield return new TestCaseData(2, 2);
            yield return new TestCaseData(3, 3);
            yield return new TestCaseData(4, 5);
            yield return new TestCaseData(5, 8);
        }
    }
}