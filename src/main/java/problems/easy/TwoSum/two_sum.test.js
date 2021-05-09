const twoSum = require("./two_sum").twoSum;
const { assert, expect } = require("chai");

describe("Two Sum", function() {
    it("samples", function() {
        assert.strictEqual(twoSum([2, 7, 11, 15], 9), [0, 1]);
        assert.strictEqual(twoSum([3, 2, 4], 6), [1, 2]);
        assert.strictEqual(twoSum([3, 3], 6), [0, 1]);
    });
});