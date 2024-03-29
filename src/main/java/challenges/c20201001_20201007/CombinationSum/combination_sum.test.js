const { combinationSum } = require("./combination_sum");

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
    test(`test Combination sum: candidates = ${candidates}, target = ${target}, returns ${expectedResult}`, () => {
      reporter
        .epic("epic Challenges")
        .feature("feature 20201001-20201007")
        .story("story Combination sum")
        // .suite("suite JavaScript")
        // .tag("tag JavaScript")
        .description("test Combination sum");
      expect(combinationSum(candidates, target)).toEqual(expectedResult);
    });
  }
);
