// 287. Find the Duplicate Number

import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {
     HashSet<Integer> ans = new HashSet<>();
     for(int i : nums){
        if(!ans.contains(i)){
            ans.add(i);
        }else{
            return i;
        }
     }
     return 1;
       
    }
}