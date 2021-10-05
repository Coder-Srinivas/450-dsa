public void nextPermutation(int[] nums) {
    int n = nums.length-1;
    int i = n-1;
    for(; i>=0 ;i--){
        if(nums[i] < nums[i+1]){
            break;
        }
    }
    if(i < 0){
        reverse(nums, 0, n);
        return;
    }
    int smallest = i+1;
    for(int j=i+1; j<=n; j++){
        if(nums[j] > nums[i] && nums[smallest] >= nums[j]){
            smallest = j;
        }
    }
    int temp = nums[smallest];
    nums[smallest] = nums[i];
    nums[i] = temp;
    
    reverse(nums, i+1, n);
}

public void reverse(int[] nums, int left, int right){
    
    while(left < right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
}