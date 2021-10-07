static boolean findsum(int arr[],int n){
        
    Set<Integer> prefix = new HashSet<>();
    int sum = 0;
    for(int i : arr){
        sum += i;
        if(prefix.contains(sum) || sum == 0){
            return true;
        }
        prefix.add(sum);
    }

    
    return false;
}