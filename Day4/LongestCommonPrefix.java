package Day4;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder s = new StringBuilder();
        for(int i=0; i<first.length(); i++){
              
              if(first.charAt(i) == last.charAt(i)){
                s.append(first.charAt(i));
              }else{
                break;
              }
        }

        return s.toString();
    }
}