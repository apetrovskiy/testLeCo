from typing import List


class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        # mine, which is wrong with the -1 case
        # for index in range(0, len(gas)):
        #     if sum(gas) - sum(cost) + cost[index]
        # >= 0 and gas[index] >= cost[index]:
        #         return index
        # return -1

        # the brute force way
        '''
        for s in range(len(gas)):
            tank = 0
            possible = True
            for i in range(s, len(gas) + s):
                station = i % len(gas)
                tank = tank + gas[station] - cost[station]
                if tank < 0:
                    possible = False
                    break
            if possible:
                return s
        return -1
        '''

        # the improved solution
        diff = [gas[i] - cost[i] for i in range(len(gas))]
        diff_total = sum(diff)

        if diff_total < 0:
            return -1
        else:
            starting, tank = 0, 0
            for i in range(len(gas)):
                tank = tank + gas[i] - cost[i]
                if tank < 0:
                    starting = i + 1
                    tank = 0

        return starting
