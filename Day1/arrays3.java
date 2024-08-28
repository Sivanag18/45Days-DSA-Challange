// 26. Remove Duplicates from Sorted Array

import java.util.LinkedHashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> ans = new LinkedHashMap<>();

        for(int i: nums){
            ans.put(i, ans.getOrDefault(i, 0)+1);
        }
        int k = ans.size();
        Integer[] res = ans.keySet().toArray(new Integer[0]);
        for(int i=0; i<k; i++){
            nums[i] = res[i];
        }

        return k;

        
    }
}