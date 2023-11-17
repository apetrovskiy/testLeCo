// <copyright file="NumberOfRecentCallsTest.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Challenges.C20201001_20201007.NumberOfRecentCalls
{
    using System.Linq;
    using NUnit.Allure.Core;
    using NUnit.Framework;
    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Challenges")]
    [AllureFeature("feature 20201001-20201007")]
    [AllureStory("story Recent counter")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    public class RecentCounterTest
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        [AllureName("test Recent counter")]
        public void PingTest()
        {
            RecentCounter obj = new RecentCounter();
            var calls = new int[] { 1, 100, 3001, 3002 };
            calls.ToList().ForEach(call => obj.Ping(call));
            /*
            int t = 200;
            int param_1 = obj.Ping(t);
            */
        }
    }
}