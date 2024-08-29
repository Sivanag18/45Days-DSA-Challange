package Day3;

// 974. Subarray Sums Divisible by K

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       
        HashMap<Integer, Integer> remainderFreq = new HashMap<>();
        remainderFreq.put(0, 1); 
        
        int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            sum += num;
            
          
            int remainder = sum % k;
            
          
            if (remainder < 0) remainder += k;
            
            
            if (remainderFreq.containsKey(remainder)) {
                count += remainderFreq.get(remainder);
            }
            
          
            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}

