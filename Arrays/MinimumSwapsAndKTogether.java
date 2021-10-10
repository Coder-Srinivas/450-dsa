public static int minSwap (int arr[], int n, int k) {
    int swaps = 0;
    int window = 0;
    for(int i=0; i<n; i++){
        if(arr[i] <= k){
            window++;
        }
    }
    for(int i=0; i<window; i++){
        if(arr[i] > k){
            swaps++;
        }
    }
    
    int ans = swaps;

    for(int i=window; i<n; i++){
        if(arr[i] > k){
            swaps++;
        }
        if(arr[i-window] > k){
            swaps--;
        }
        ans = Math.min(ans, swaps);
    }
    
    return ans;
}