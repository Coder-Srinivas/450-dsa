public static int smallestSubWithSum(int a[], int n, int x) {
    int sum = 0;
    int i=0;
    int j=0;
    int ans = Integer.MAX_VALUE;
    while(j < n && i < n){
        
        while(sum <= x && j<n){
            sum+=a[j];
            j++;
        }
        
        while(sum > x && i<n){
            if(sum > x)
            ans = Math.min(ans, j-i);
            sum-=a[i];
            i++;
        }
    }
    
    return ans;
}