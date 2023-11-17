// <copyright file="ClimbingStairsTest.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Problems.Easy.ClimbingStairs
{
    using System.Collections.Generic;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Problems")]
    [AllureFeature("feature Easy")]
    [AllureStory("story Climbing stairs")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    public class ClimbingStairsTest
    {
        private Solution cut;

        public static IEnumerable<TestCaseData> GetInputData()
        {
            yield return new TestCaseData(1, 1);
            yield return new TestCaseData(2, 2);
            yield return new TestCaseData(3, 3);
            yield return new TestCaseData(4, 5);
            yield return new TestCaseData(5, 8);
        }

        [SetUp]
        public void SetUp()
        {
            this.cut = new Solution();
        }

        [Test]
        [TestCaseSource(nameof(GetInputData))]
        [AllureName("test Climbing stairs")]
        public void ShouldCalculateStairs(int input, int expectedResult)
        {
            Assert.That(this.cut.ClimbStairs(input), Is.EqualTo(expectedResult));
        }
    }
}