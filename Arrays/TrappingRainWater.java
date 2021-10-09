static long trappingWater(int arr[], int n) { 
    long[] prefix = new long[n];
    long[] suffix = new long[n];
    
    prefix[0] = arr[0];
    suffix[n-1] = arr[n-1];
    
    for(int i=1; i<n; i++){
        prefix[i] = Math.max(prefix[i-1], arr[i]);
    }
    
    for(int i=n-2; i>=0; i--){
        suffix[i] = Math.max(suffix[i+1], arr[i]);
    }
    long ans = 0;
    for(int i=1; i<n-1; i++){
        long min = Math.min(prefix[i], suffix[i]);
        ans += min - arr[i];
    }

    return ans;
} 