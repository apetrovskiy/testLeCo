namespace problems.easy.ClimbingStairs
{
    using System.Collections.Generic;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [AllureNUnit]
    public class ClimbingStairsTest
    {
        private Solution cut;
        [SetUp]
        public void SetUp()
        {
            cut = new Solution();
        }

        [Test, TestCaseSource("GetInputData")]
        public void ShouldCalculateStairs(int input, int expectedResult)
        {
            Assert.AreEqual(expectedResult, cut.ClimbStairs(input));
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