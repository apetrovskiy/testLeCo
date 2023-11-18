const { findShortestSubArray } = require("./degree_of_an_array");

describe.each([
  [[1, 2, 2, 3, 1], 2],
  [[1, 2, 2, 3, 1, 4, 2], 6],
])("findShortestSubArray(%o) should equal %i", (inputArray, expectedResult) => {
  test(`test Degree of an array: inputArray = {inputArray} returns {expectedResult}`, () => {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Degree of an array")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Degree of an array");
    expect(findShortestSubArray(inputArray)).toEqual(expectedResult);
  });
});
