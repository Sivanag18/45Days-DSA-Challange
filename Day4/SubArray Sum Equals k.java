package Day4;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
         int n = nums.length;
         int ans = 0;
        
        // for(int i=0; i<nums.length; i++){
        //       int sum = 0;
        //     for(int j=i; j<nums.length; j++){
                  
        //           sum += nums[j];

        //           if(sum == k){
        //             ans++;
        //           }

        //     }
        // }
        // return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        map.put(0,1);
        for(int i=0; i<n; i++){
              sum += nums[i];
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            } 

            map.put(sum, map.getOrDefault(sum, 0)+1);
            
        }

        return ans;

    }
}