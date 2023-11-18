const { climbStairs } = require("./climbing_stairs");

describe.each([
  [1, 1],
  [2, 2],
  [3, 3],
  [4, 5],
  [5, 8],
])("climbStairs(%i) should equal %i", (input, expectedResult) => {

  test(`test Climbing stairs: input = {input}, returns = {expectedResult}`, () => {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Climbing stairs")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Climbing stairs");
    expect(climbStairs(input)).toEqual(expectedResult);
  });
});
