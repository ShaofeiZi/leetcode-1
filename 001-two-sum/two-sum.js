# -*- coding:utf-8 -*-


# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
#
# You may assume that each input would have exactly one solution.
#
#
# Example:
#
# Given nums = [2, 7, 11, 15], target = 9,
#
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].
#
#
#
#
# UPDATE (2016/2/13):
# The return format had been changed to zero-based indices. Please read the above updated description carefully.


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var i = 0;
    var dict = {}
    for(;i<nums.length;i++){
        if(dict[nums[i]] !== undefined){
            return [dict[nums[i]],i];
        }else{
            dict[target-nums[i]] = i;
        }
    }
    return []
};
