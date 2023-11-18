const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

const { findShortestSubArray } = require("./degree_of_an_array");

describe.each([
  [[1, 2, 2, 3, 1], 2],
  [[1, 2, 2, 3, 1, 4, 2], 6],
])("findShortestSubArray(%o) should equal %i", (inputArray, expectedResult) => {
  allure.epic("epic Problems");
  allure.feature("feature Easy");
  allure.story("story Degree of an array");
  allure.suite("suite JavaScript");
  allure.tag("tag JavaScript");
  test(`inputArray = {inputArray} returns {expectedResult}`, () => {
    allure.description("test Degree of an array");

    expect(findShortestSubArray(inputArray)).toEqual(expectedResult);
  });
});
