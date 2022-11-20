const { findShortestSubArray } = require("./degree_of_an_array");

describe.each([
    [
        [1, 2, 2, 3, 1], 2
    ],
    [
        [1, 2, 2, 3, 1, 4, 2], 6
    ],
])("findShortestSubArray(%o) should equal %i", (inputArray, expectedResult) => {
    test(`inputArray = {inputArray} returns {expectedResult}`, () => {
        expect(findShortestSubArray(inputArray)).toEqual(expectedResult);
    });
});