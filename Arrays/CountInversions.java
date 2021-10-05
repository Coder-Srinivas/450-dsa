static long inversionCount(long arr[], long N){
    return mergeSort(arr, 0, arr.length-1);
}

static long mergeSort(long arr[], int left, int right){
    
    if(left < right){
        int mid = left + (right - left)/2;
        long leftAns = mergeSort(arr, left, mid);
        long rightAns = mergeSort(arr, mid+1, right);
        long mainAns = merge(arr, left, mid, right);
        
        return leftAns + rightAns + mainAns;
    }
    
    return 0;
    
}

static long merge(long arr[], int left, int mid, int right){
    
    long temp[] = new long[right - left + 1];
    long ans = 0;
    int i = left;
    int j = mid+1;
    int x = 0;
    
    while(i <= mid && j <= right){
        if(arr[i] <= arr[j]){
            temp[x] = arr[i];
            i++;
        }else{
            temp[x] = arr[j];
            j++;
            ans+= (mid - i + 1);
        }
        x++;
    }
    
    while(i <= mid){
        temp[x] = arr[i];
        x++;
        i++;
    }
    
    while(j <= right){
        temp[x] = arr[j];
        x++;
        j++;
    }
    
    x = 0;
    i = left;
    for(; x<temp.length; x++){
        arr[i] = temp[x];
        i++;
    }
    
    return ans;
}