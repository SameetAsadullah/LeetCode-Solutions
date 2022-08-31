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