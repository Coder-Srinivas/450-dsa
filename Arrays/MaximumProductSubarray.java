long maxProduct(int[] arr, int n) {

    long ans = Integer.MIN_VALUE;
    
    for(int i : arr){
        ans = Math.max(ans, i);
    }
    
    long min = 1;
    long max = 1;
    
    for(int i : arr){
        if(i == 0){
            min = 1;
            max = 1;
            continue;
        }
        long mi = min;
        long ma = max;
        
        max = Math.max(i * ma, i * mi);
        max = Math.max(max, i);
        min = Math.min(i * ma, i * mi);
        min = Math.min(min, i);
        
        ans = Math.max(ans, max);
    }
    
    return ans;
}
