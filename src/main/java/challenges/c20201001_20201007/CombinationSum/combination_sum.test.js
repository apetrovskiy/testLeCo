const { combinationSum } = require("./combination_sum");
const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

describe.each([
  [[2, 3, 6, 7], 8, [[2, 2, 3], [7]]],
  [
    [2, 3, 5],
    8,
    [
      [2, 2, 2, 2],
      [2, 3, 3],
      [3, 5],
    ],
  ],
  [[2], 1, []],
  [[1], 1, [[1]]],
  [[1], 2, [[1, 1]]],
])(
  "combinationSum(%o, %i) should equal %i",
  (candidates, target, expectedResult) => {
    allure.epic("epic Challenges");
    allure.feature("feature 20201001-20201007");
    allure.story("story Combination sum");
    allure.suite("suite JavaScript");
    allure.tag("tag JavaScript");
    test(`candidates = ${candidates}, target = ${target}, returns ${expectedResult}`, () => {
      allure.description("test Combination sum");
      expect(combinationSum(candidates, target)).toEqual(expectedResult);
    });
  }
);
