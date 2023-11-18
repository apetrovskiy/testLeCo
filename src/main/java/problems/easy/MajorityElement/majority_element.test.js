const { majorityElement } = require("./majority_element");
const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

describe.each([
  [[3, 2, 3], 3],
  [[2, 2, 1, 1, 1, 2, 2], 2],
])("majorityElement(%o) should equal to %i", (inputArray, expectedResult) => {
  allure.epic("epic Problems");
  allure.feature("feature Easy");
  allure.story("story Majority element");
  allure.suite("suite JavaScript");
  allure.tag("tag JavaScript");
  test(`input = {inputArray}, returns {expectedResult}`, () => {
    allure.description("test Majority element");
    expect(majorityElement(inputArray)).toEqual(expectedResult);
  });
});
