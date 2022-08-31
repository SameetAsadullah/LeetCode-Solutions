"""
 * Algorithm:
 * We are iterating and inserting elements into the hash table, 
 * we also look back to check if current element's complement already 
 * exists in the hash table. If it exists, we have found a solution 
 * and return the indices immediately.
 * Time complexity: O(n)
 * Space complexity: O(n)
"""

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valueMap = {}    # value : index
        for index, value in enumerate(nums):
            diff = target - value
            if diff in valueMap:        # if difference found
                return [valueMap[diff], index]
            valueMap[value] = index     # if difference not found
        return None     # no solution