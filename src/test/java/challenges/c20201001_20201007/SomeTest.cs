// <copyright file="SomeTest.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Challenges.C20201001_20201007;

    using NUnit.Framework;
    using NUnit.Allure.Attributes;
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [TestFixture]
    [AllureNUnit]
    [AllureEpic("epic Challenges")]
    [AllureFeature("feature 20201001-20201007")]
    [AllureStory("story Some")]
    [AllureSuite("suite C#")]
    [AllureTag("tag C#")]
    public class SomeTest
    {
        [Test]
                [AllureName("test Some")]
        public void Test()
        {
            // TODO: make it really working
            Assert.That(1, Is.EqualTo(1));
        }
    }
