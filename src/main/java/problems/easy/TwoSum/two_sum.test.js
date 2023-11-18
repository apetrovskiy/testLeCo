const twoSum = require("./two_sum").twoSum;

describe("Two Sum", function () {
  it("case 01", function () {

    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Two sum")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Two sum 01");
    assert.strictEqual(twoSum([2, 7, 11, 15], 9), [0, 1]);
  });
  it("case 02", function () {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Two sum")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Two sum 02");
    assert.strictEqual(twoSum([3, 2, 4], 6), [1, 2]);
  });
  it("case 03", function () {
    reporter
      .epic("epic Problems")
      .feature("feature Easy")
      .story("story Two sum")
      // .suite("suite JavaScript")
      // .tag("tag JavaScript")
      .description("test Two sum 03");


    assert.strictEqual(twoSum([3, 3], 6), [0, 1]);
  });
});
