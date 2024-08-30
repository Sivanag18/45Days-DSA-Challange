package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
           
           if(i>0 && nums[i] == nums[i-1]){
              continue;
           }
           
           int j = i+1;
           int k = n - 1;

           while(j<k){
               int sum = nums[i]+nums[j]+nums[k];

               if(sum > 0){
                k--;
               }else if(sum < 0){
                j++;
               }else{
                  ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                  j++;

                  while(nums[j] == nums[j-1] && j<k){
                    j++;
                  }
               }
           }

        }

        return ans;
        


        
         
 
    }
}