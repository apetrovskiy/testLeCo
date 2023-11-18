const { canCompleteCircuit } = require("./gas_station");

const { assert, expect } = require("chai");
const { allure } = require("allure-mocha/runtime");

describe.each([
  [[1, 2, 3, 4, 5], [3, 4, 5, 1, 2], 3],
  [[2, 3, 4], [3, 4, 3], -1],
  [[7, 1, 0, 11, 4], [5, 9, 1, 2, 5], 3],
])(
  "canCompleteCircuit(%i, %i) should equal %i",
  (gas, cost, expectedResult) => {
    allure.epic("epic Problems");
    allure.feature("feature Medium");
    allure.story("story Gas station");
    allure.suite("suite JavaScript");
    allure.tag("tag JavaScript");
    test(`gas = ${gas}, cost = ${cost}, returns ${expectedResult}`, () => {
      allure.description("test Gas station");

      expect(canCompleteCircuit(gas, cost)).toEqual(expectedResult);
    });
  }
);
