namespace problems.medium.GasStation
{

    using NUnit.Framework;

    class GasStationTest
    {
        private Solution cut;

        [SetUp]
        public void SetUp()
        {
            cut = new Solution();
        }

        [TestCase(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }, 3)]
        [TestCase(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }, -1)]
        [TestCase(new int[] { 7, 1, 0, 11, 4 }, new int[] { 5, 9, 1, 2, 5 }, 3)]
        public void TestGasStation(int[] gas, int[] cost, int expectedResult)
        {
            Assert.AreEqual(expectedResult, cut.CanCompleteCircuit(gas, cost));
        }
    }
}