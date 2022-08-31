class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueMap = new HashMap<>(); // value : index
        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if (valueMap.containsKey(diff)) {
                return new int[] { valueMap.get(diff), i};
            }
            valueMap.put(nums[i], i);
        }
        return null; // no solution
    }
}