// <copyright file="GasStationTest.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Problems.Medium.GasStation
{
    using NUnit.Allure.Core;
    using NUnit.Framework;

    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Problems")]
    [AllureFeature("feature Medium")]
    [AllureStory("story Gas station")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    internal class GasStationTest
    {
        private Solution cut;

        [SetUp]
        public void SetUp()
        {
            this.cut = new Solution();
        }

        [TestCase(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }, 3)]
        [TestCase(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }, -1)]
        [TestCase(new int[] { 7, 1, 0, 11, 4 }, new int[] { 5, 9, 1, 2, 5 }, 3)]
        [AllureName("test Gas station")]
        public void TestGasStation(int[] gas, int[] cost, int expectedResult)
        {
            Assert.That(this.cut.CanCompleteCircuit(gas, cost), Is.EqualTo(expectedResult));
        }
    }
}