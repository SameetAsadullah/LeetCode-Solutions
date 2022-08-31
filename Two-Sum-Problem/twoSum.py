class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valueMap = {}    # value : index
        for index, value in enumerate(nums):
            diff = target - value
            if diff in valueMap:        # if difference found
                return [valueMap[diff], index]
            valueMap[value] = index     # if difference not found
        return None     # no solution