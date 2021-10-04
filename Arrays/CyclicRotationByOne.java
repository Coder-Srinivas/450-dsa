public void rotate(int arr[], int n){
    reverse(arr, 0, n-1);
    reverse(arr, 1, n-1);
}

public static void reverse(int arr[], int l, int r){
    
    while(l < r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
    }
}