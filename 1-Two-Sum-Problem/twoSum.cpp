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
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> valueMap; // value : index
        vector<int> output;
        for (int i = 0; i < nums.size(); ++i) {
            int diff = target - nums[i];
            if (valueMap.find(diff) == valueMap.end()) {    // difference not found
                valueMap.insert(pair<int, int>(nums[i], i));
            } else {    // difference found
                output.push_back(valueMap[diff]);
                output.push_back(i);
                return output;
            }
        }
        return output;  // no solution
    }
};