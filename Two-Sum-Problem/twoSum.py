class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valueMap = {}    # value : index
        for index, value in enumerate(nums):
            diff = target - value
            if diff in valueMap:
                return [valueMap[diff], index]
            valueMap[value] = index
        return None     # no solution