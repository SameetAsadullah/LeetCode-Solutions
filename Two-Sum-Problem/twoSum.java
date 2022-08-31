class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueMap = new HashMap<>(); // value : index
        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if (valueMap.containsKey(diff)) {   // if difference found
                return new int[] { valueMap.get(diff), i};
            }
            valueMap.put(nums[i], i);   // if difference not found
        }
        return null; // no solution
    }
}