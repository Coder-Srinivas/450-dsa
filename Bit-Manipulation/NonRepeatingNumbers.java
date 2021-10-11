public int[] singleNumber(int[] nums){
    int total = 0;
    for(int i : nums){
        total ^= i;
    }
    int firstSetBit = getFirstSetBit(total);
    
    int num1 = 0;
    for(int i : nums){
        if(bitSet(i, firstSetBit)){
            num1 ^= i;
        }
    }
    int ans[] = new int[]{num1, num1^total};
    Arrays.sort(ans);
    return ans;
}

public int getFirstSetBit(int num){
    int i = 0;
    while(num > 0){
        if((num & 1) == 1){
            return i;
        }
        num = num>>1;
        i++;
    }
    return 0;
}

public boolean bitSet(int num, int pos){
    int i=0;
    while(num > 0){
        if((num & 1) == 1 && pos == i){
            return true;
        }
        num = num>>1;
        i++;
    }
    return false;
}