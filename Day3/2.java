package Day3;

// Chocolate Distribution Problem


class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans = 0;
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = a.get(i);
        }
        
        long min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=0; i<=n-m; i++){
            
            min = Math.min(min, arr[i+m-1] - arr[i]);
            
        }
        
        return min;
        
          
    }
}
