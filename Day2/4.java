// 28. Find the Index of the First Occurrence in a String


class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        int size = haystack.length();
        int ssize= needle.length();
       if(size < ssize ){
           return -1;
       }
       for(int i=0; i<= size - ssize; i++){
           int j=0;
           while(j<ssize && haystack.charAt(i+j) == needle.charAt(j)){
               j++;
               if(j == ssize){
                   return i;
               }
           }
       }
       return -1;
       
       
    }
}