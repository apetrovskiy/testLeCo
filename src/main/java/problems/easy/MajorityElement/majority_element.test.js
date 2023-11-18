const { majorityElement } = require("./majority_element");

describe.each([
  [[3, 2, 3], 3],
  [[2, 2, 1, 1, 1, 2, 2], 2],
])("majorityElement(%o) should equal to %i", (inputArray, expectedResult) => {
  test(`input = {inputArray}, returns {expectedResult}`, () => {
    expect(majorityElement(inputArray)).toEqual(expectedResult);
  });
});
