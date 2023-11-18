const { climbStairs } = require("./climbing_stairs");
const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

describe.each([
  [1, 1],
  [2, 2],
  [3, 3],
  [4, 5],
  [5, 8],
])("climbStairs(%i) should equal %i", (input, expectedResult) => {
  allure.epic("epic Problems");
  allure.feature("feature Easy");
  allure.story("story Climbing stairs");
  allure.suite("suite JavaScript");
  allure.tag("tag JavaScript");
  test(`input = {input}, returns = {expectedResult}`, () => {
    allure.description("test Climbing stairs");
    expect(climbStairs(input)).toEqual(expectedResult);
  });
});
