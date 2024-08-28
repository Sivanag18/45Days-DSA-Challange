// Same characters in two strings



class Solution 
{ 
    int sameChar(String A, String B) 
    {
        // code here
        int sum =0;
        
        for(int i=0; i<A.length(); i++){
            
            if(Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(B.charAt(i))){
                sum++;
            }
        }
        return sum;
    }
} 