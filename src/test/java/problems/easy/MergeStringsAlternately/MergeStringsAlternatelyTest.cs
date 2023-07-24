namespace test.java.problems.easy.MergeStringsAlternately;

using Allure.Commons;
using Allure.Xunit.Attributes;
using main.java.problems.easy.MergeStringsAlternately;
using Xunit;



public class MergeStringsAlternatelyTest
{
    [AllureEpic("Unit testing in F#")]
    [AllureFeature("Parameterized tests")]
    [AllureStory("NUnit, xUnit")]
    [AllureSuite("NUnit, xUnit")]
    [AllureTag("NUnit", "xUnit")]
    [AllureSeverity(SeverityLevel.normal)]
    [AllureIssue("GitHub#1", "https://github.com/unickq/allure-nunit")]
    [AllureId("123")]
    [AllureXunitTheory]
    [MemberData(nameof(factorialXunitTestData))]
    public void MergeAlternativelyTest(string word1, string word2, string expectedResult)
    {
        var actualResult = new MergeStringsAlternatelySolution().MergeAlternately(word1: word1, word2: word2);
        Assert.Equal(expectedResult, actualResult);
    }

    public static IEnumerable<object[]> factorialXunitTestData =>
            new List<object[]>
            {
            new object[] { "abc",  "pqr", "apbqcr" },
            new object[] {  "ab","pqrs", "apbqrs" },
            new object[] { "abcd",  "pq", "apbqcd" },
            };
}


