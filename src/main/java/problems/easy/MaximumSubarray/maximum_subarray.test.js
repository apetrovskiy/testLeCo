const { maxSubArray } = require("./maximum_subarray");

describe.each([
  [[-2, 1, -3, 4, -1, 2, 1, -5, 4], 6],
  [[1], 1],
  [[5, 4, -1, 7, 8], 23],
  [[5, -3, 6, -7, 6], 8],
  [[6, -7, 6, -3, 5], 8],
  [[-2, -3, 4, -1, -2, 1, 5, -3], 7],
  [[-1], -1],
  [[-2, -1], -1],
])("maxSubArray(%o) should equal %i", (inputArray, expectedResult) => {

  test(`test Maximum subarray: inputArray = {inputArray}, returns {expectedResult}`, () => {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Maximum subarray")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Maximum subarray");


    expect(maxSubArray(inputArray)).toEqual(expectedResult);
  });
});
