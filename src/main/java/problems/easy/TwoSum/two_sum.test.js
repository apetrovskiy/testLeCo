const twoSum = require("./two_sum").twoSum;
const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

describe("Two Sum", function () {
  allure.epic("epic Problems");
  allure.feature("feature Easy");
  allure.story("story Two sum");
  allure.suite("suite JavaScript");
  allure.tag("tag JavaScript");
  it("case 01", function () {
    allure.description("test Two sum 01");
    assert.strictEqual(twoSum([2, 7, 11, 15], 9), [0, 1]);
  });
  it("case 02", function () {
    allure.description("test Two sum 02");
    assert.strictEqual(twoSum([3, 2, 4], 6), [1, 2]);
  });
  it("case 03", function () {
    allure.description("test Two sum 03");
    assert.strictEqual(twoSum([3, 3], 6), [0, 1]);
  });
});
