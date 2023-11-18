const { climbStairs } = require("./climbing_stairs");

describe.each([
  [1, 1],
  [2, 2],
  [3, 3],
  [4, 5],
  [5, 8],
])("climbStairs(%i) should equal %i", (input, expectedResult) => {
  test(`input = {input}, returns = {expectedResult}`, () => {
    expect(climbStairs(input)).toEqual(expectedResult);
  });
});
