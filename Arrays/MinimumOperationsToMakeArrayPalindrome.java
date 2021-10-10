public static int merge(List<Integer> ar){

    int i = 0;
    int j = ar.size()-1;
    int ans = 0;
    while(i < j){
        int left = ar.get(i);
        int right = ar.get(j);
        
        if(left == right){
            i++;
            j--;
        }else if(left < right){
            i++;
            ar.set(i, ar.get(i) + left);
            ans++;
        }else{
            j--;
            ar.set(j, ar.get(j) + right);
            ans++;
        }
    }
    return ans; 
}