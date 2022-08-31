/*
 * Algorithm:
 * We are iterating and inserting elements into the hash table, 
 * we also look back to check if current element's complement already 
 * exists in the hash table. If it exists, we have found a solution 
 * and return the indices immediately.
 * Time complexity: O(n)
 * Space complexity: O(n)
*/

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