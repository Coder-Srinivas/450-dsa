public static boolean find3Numbers(int A[], int n, int X) { 
        
    Arrays.sort(A);
    for(int i=0; i<n; i++){
        if(find2Numbers(A, X-A[i], i+1, n-1)){
            return true;
        }
    }
    return false;
}

public static boolean find2Numbers(int A[], int X, int low, int high){
    
    while(low < high){
        int sum = A[low] + A[high];
        if(sum == X){
            return true;
        }else if(sum < X){
            low++;
        }else{
            high--;
        }
    }
    
    return false;
}