/**
 * Algorithm:
 * We are iterating and inserting elements into the hash table, 
 * we also look back to check if current element's complement already 
 * exists in the hash table. If it exists, we have found a solution 
 * and return the indices immediately.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    let valueMap = new Map();   // value : index
    let output = [];
    for (let i = 0; i < nums.length; ++i) {
        let diff = target - nums[i];
        if (valueMap.has(diff)) {   // if difference found
            output[0] = valueMap.get(diff);
            output[1] = i;
            return output;
        }
        valueMap.set(nums[i], i);   // if difference not found
    }
    return output;  // no solution
};