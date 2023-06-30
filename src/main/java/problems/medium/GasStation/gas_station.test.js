const { canCompleteCircuit } = require("./gas_station");

describe.each([
    [
        [1, 2, 3, 4, 5],
        [3, 4, 5, 1, 2], 3
    ],
    [
        [2, 3, 4],
        [3, 4, 3], -1
    ],
    [
        [7, 1, 0, 11, 4],
        [5, 9, 1, 2, 5], 3
    ],
])(
    "canCompleteCircuit(%i, %i) should equal %i",
    (gas, cost, expectedResult) => {
        test(`gas = ${gas}, cost = ${cost}, returns ${expectedResult}`, () => {
            expect(canCompleteCircuit(gas, cost)).toEqual(expectedResult);
        });
    }
);