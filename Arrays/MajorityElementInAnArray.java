public List<Integer> majorityElement(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MAX_VALUE;
        int c1 = 0;
        int c2 = 0;
        for(int i : nums){
            if(i == one){
                c1++;
            }else if(i == two){
                c2++;
            }else if(c1 == 0){
                one = i;
                c1 = 1;
            }else if(c2 == 0){
                two = i;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(i == one){
                c1++;
            }else if(i == two){
                c2++;
            }
        }
        
        List<Integer> ans=  new ArrayList<>();
        if(c1 > nums.length/3){
            ans.add(one);
        }
        
        if(c2 > nums.length/3){
            ans.add(two);
        }
        
        return ans;
    }