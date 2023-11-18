const { maxSubArray } = require("./maximum_subarray");
const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

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
  allure.epic("epic Problems");
  allure.feature("feature Easy");
  allure.story("story Maximum subarray");
  allure.suite("suite JavaScript");
  allure.tag("tag JavaScript");
  test(`inputArray = {inputArray}, returns {expectedResult}`, () => {
    allure.description("test Maximum subarray");
    expect(maxSubArray(inputArray)).toEqual(expectedResult);
  });
});
