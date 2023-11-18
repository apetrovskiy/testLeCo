const { majorityElement } = require("./majority_element");

describe.each([
  [[3, 2, 3], 3],
  [[2, 2, 1, 1, 1, 2, 2], 2],
])("majorityElement(%o) should equal to %i", (inputArray, expectedResult) => {

  test(`test Majority element: input = {inputArray}, returns {expectedResult}`, () => {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Majority element")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Majority element");


    expect(majorityElement(inputArray)).toEqual(expectedResult);
  });
});
