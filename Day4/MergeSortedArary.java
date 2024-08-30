package Day4;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for(int i=m; i<=m+n-1; i++){
            if(j < n){
           nums1[i] = nums2[j++];
            }else{
                break;
            }
        }
        for(int k=0; k<nums1.length; k++){
          for(int i=k+1; i<nums1.length; i++){
             if(nums1[k] > nums1[i]){
                 int temp = nums1[i];
                 nums1[i] = nums1[k];
                 nums1[k] = temp;
             }
         }
        }
      //  Arrays.sort(nums1);
    }
}