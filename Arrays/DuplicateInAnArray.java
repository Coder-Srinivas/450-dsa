public int findDuplicate(int[] nums) {
        
    for(int i=0; i<nums.length; i++){
        int current = Math.abs(nums[i])-1;
        if(nums[current] < 0){
            return current+1;
        }else{
            nums[current]*=-1;
        }
    }
    
    return 0;
}